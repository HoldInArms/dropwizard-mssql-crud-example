package hu.holdinarms.example.core;

public class Keyword {

	private long id;
	
	private String name;
	
	public Keyword(){
		id = 0;
		name = "";
	}
	
	public Keyword(long id, String name) {
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
