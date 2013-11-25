package hu.holdinarms.example.core;

public class Campaign {

	private long id;
	
	private String name;
	
	private long brand_id;
	
	public Campaign(){
		this.id = 0;
		this.name = "";
		this.brand_id = 0;
	}

	public Campaign(long id, String name, long brand_id) {
		super();
		this.id = id;
		this.name = name;
		this.brand_id = brand_id;
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

	public long getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(long brand_id) {
		this.brand_id = brand_id;
	}
	
}
