package hu.holdinarms.example.core;

public class Campaign {

	private long id;
	
	private String name;
	
	private long brand_id;
	
	//
	private String brand_name;
	//
	
	public Campaign(){
		//nothing here
	}

//	public Campaign(long id, String name, long brand_id) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.brand_id = brand_id;
//	}
	
	public Campaign(long id, String name, long brand_id, String brand_name) {
		super();
		this.id = id;
		this.name = name;
		this.brand_id = brand_id;
		this.brand_name = brand_name;
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

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	
}
