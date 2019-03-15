	package br.com.elasticsearch.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import br.com.elasticsearch.model.ElasticModel;
import br.com.elasticsearch.model.Filme;
import br.com.elasticsearch.model.SearchCriteriaModel;
import br.com.elasticsearch.model.SearchModel;
import br.com.elasticsearch.rest.FilmeClient;

@Controller
public class FilmeController {

	@Autowired
	private FilmeClient client;
	
	@Autowired
	private Filme filme;
	
	@Autowired
	private ElasticModel em;
	
	@Autowired
	private SearchModel sm;
	
	@Autowired 
	private SearchCriteriaModel scm;

	@GetMapping("/filme/{id}")
	public ModelAndView busca(@PathVariable("id") Integer id) {
		ModelAndView mav = new ModelAndView("/filmes/busca");
		
		Optional<ElasticModel> modelo = client.request(id,em,ElasticModel.class);
		
		modelo.orElse(new ElasticModel());
		filme = modelo.get().getSource();
		mav.addObject("filme", filme);
		
		return mav;
	}
	
	@GetMapping("/filme/lista")
	public ModelAndView lista() {
		ModelAndView mav = new ModelAndView("/filmes/lista");
		
		Optional<SearchModel> modelo = client.list(sm, SearchModel.class);
		modelo.orElse(new SearchModel());
		List<Filme> filmes = new ArrayList<Filme>();
		scm = modelo.get().getHits();
		
		for(int i = 0; i < scm.getHits().size(); i++) {
			filmes.add(scm.getHits().get(i).getSource());
			filmes.get(i).setId(scm.getHits().get(i).getId());
			}

		mav.addObject("filmes", filmes);
		
		return mav;
		
	}
	
}
