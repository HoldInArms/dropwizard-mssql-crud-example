package hu.holdinarms.example.core;

public class Campaign {

	private long id;
	
	private String name;
	
	private long brandId;

	public Campaign(long id, String name, long brandId) {
		super();
		this.id = id;
		this.name = name;
		this.brandId = brandId;
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

	public long getBrandId() {
		return brandId;
	}

	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}
	
}
