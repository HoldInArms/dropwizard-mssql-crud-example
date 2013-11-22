package hu.holdinarms.example.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Brand {

	@JsonProperty
	private long id;
	
	@JsonProperty
	private String name;
	
	public Brand(){
		id = 0;
		name = "";
	}
	
	public Brand( long id, String name ){
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
