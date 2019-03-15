package br.com.elasticsearch.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class ElasticModel {

	@JsonProperty("_index")
	private String index;
	
	@JsonProperty("_type")
	private String tipo;
	
	@JsonProperty("_id")
	private String id;
	
	@JsonProperty("_score")
	private String score;
	
	@JsonProperty("_source")
	private Filme source;

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public Filme getSource() {
		return source;
	}

	public void setSource(Filme source) {
		this.source = source;
	}
	
	
}
