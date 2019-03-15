	package br.com.elasticsearch.model;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class SearchCriteriaModel {

	@JsonProperty("total")
	private String total;
	
	@JsonProperty("max_score")
    private String maxScore;
	
	@JsonProperty("hits")
    private List<ElasticModel> hits;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(String maxScore) {
		this.maxScore = maxScore;
	}

	public List<ElasticModel> getHits() {
		return hits;
	}

	public void setHits(List<ElasticModel> hits) {
		this.hits = hits;
	}

	
	
}
