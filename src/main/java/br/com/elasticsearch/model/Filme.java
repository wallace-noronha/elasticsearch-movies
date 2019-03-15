package br.com.elasticsearch.model;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class Filme {

	private String id;
	
	@JsonProperty("Title")
	private String titulo;
	
	@JsonProperty("Year")
	private String ano;
	
	@JsonProperty("Rated")
	private String rated;
	
	@JsonProperty("Released")
	private String lancamento;
	
	@JsonProperty("Runtime")
	private String tempo;
	
	@JsonProperty("Genre")
	private String genero;
	
	@JsonProperty("Director")
	private String diretor;
	
	@JsonProperty("Writer")
	private String escritor;
	
	@JsonProperty("Actors")
	private String atores;
	
	@JsonProperty("Plot")
	private String descricao;
	
	@JsonProperty("Language")
	private String linguagem;
	
	@JsonProperty("Country")
	private String pais;
	
	@JsonProperty("Awards")
	private String oscar;
	
	@JsonProperty("Poster")
	private String capa;
	
	@JsonProperty("Ratings")
	private List<SourceRating> ratings;

	@JsonProperty("Metascore")
	private String metascore;
	
	@JsonProperty("imdbRating")
	private String imdbRating;
	
	@JsonProperty("imdbVotes")
	private String imdbVotes;
	
	@JsonProperty("imdbID")
	private String imdbID;
	
	@JsonProperty("Type")
	private String tipo;
	
	@JsonProperty("DVD")
	private String dvd;
	
	@JsonProperty("BoxOffice")
	private String boxOffice;
	
	@JsonProperty("Production")
	private String production;
	
	@JsonProperty("Website")
	private String website;
	
	@JsonProperty("Response")
	private String response;

	
	//Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getRated() {
		return rated;
	}

	public void setRated(String rated) {
		this.rated = rated;
	}

	public String getLancamento() {
		return lancamento;
	}

	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getEscritor() {
		return escritor;
	}

	public void setEscritor(String escritor) {
		this.escritor = escritor;
	}

	public String getAtores() {
		return atores;
	}

	public void setAtores(String atores) {
		this.atores = atores;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getOscar() {
		return oscar;
	}

	public void setOscar(String oscar) {
		this.oscar = oscar;
	}

	public String getCapa() {
		return capa;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}

	public List<SourceRating> getRatings() {
		return ratings;
	}

	public void setRatings(List<SourceRating> ratings) {
		this.ratings = ratings;
	}
	
	public String getMetascore() {
		return metascore;
	}

	public void setMetascore(String metascore) {
		this.metascore = metascore;
	}

	public String getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}

	public String getImdbVotes() {
		return imdbVotes;
	}

	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDvd() {
		return dvd;
	}

	public void setDvd(String dvd) {
		this.dvd = dvd;
	}

	public String getBoxOffice() {
		return boxOffice;
	}

	public void setBoxOffice(String boxOffice) {
		this.boxOffice = boxOffice;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
}
