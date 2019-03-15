package br.com.elasticsearch.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class SearchModel {

	@JsonProperty("took")
	private String took;
	
	@JsonProperty("timed_out")
	private String timeout;

	@JsonProperty("_shards")
	private ShardsModel shards;
	
	@JsonProperty("hits")
	private SearchCriteriaModel hits;

	public String getTook() {
		return took;
	}

	public void setTook(String took) {
		this.took = took;
	}

	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public ShardsModel getShards() {
		return shards;
	}

	public void setShards(ShardsModel shards) {
		this.shards = shards;
	}

	public SearchCriteriaModel getHits() {
		return hits;
	}

	public void setHits(SearchCriteriaModel hits) {
		this.hits = hits;
	}
	
	
	
}
