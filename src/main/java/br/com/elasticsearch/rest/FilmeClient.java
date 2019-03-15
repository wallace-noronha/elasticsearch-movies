package br.com.elasticsearch.rest;

import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import br.com.elasticsearch.model.ElasticModel;
import br.com.elasticsearch.model.SearchModel;

@Component
public class FilmeClient {

	public <T> Optional<T> request(Integer id, ElasticModel em, Class<T> tClass){
		RestTemplate client = new RestTemplate();
		
		String url = String.format("http://192.168.99.100:9200/movies/title/" + id);

		try{
			return Optional.of(client.getForObject(url, tClass));
		}catch(RestClientException e){
			return Optional.empty();
		}
	}	
	
	public <T> Optional<T> list(SearchModel sm, Class<T> tClass){
		RestTemplate client = new RestTemplate();
		
		String url = String.format("http://192.168.99.100:9200/movies/title/_search?size=1000");
		
		try{
			return Optional.of(client.getForObject(url, tClass));
		}catch(RestClientException e){
			return Optional.empty();
		}
		
		
	}	
}
