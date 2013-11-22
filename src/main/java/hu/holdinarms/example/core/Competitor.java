package hu.holdinarms.example.core;

public class Competitor {

	private long campaign_id;
	
	private long brand_id;

	public Competitor(long campaign_id, long brand_id) {
		super();
		this.campaign_id = campaign_id;
		this.brand_id = brand_id;
	}

	public long getCampaign_id() {
		return campaign_id;
	}

	public void setCampaign_id(long campaign_id) {
		this.campaign_id = campaign_id;
	}

	public long getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(long brand_id) {
		this.brand_id = brand_id;
	}
	
	
}
