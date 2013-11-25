package hu.holdinarms.example.core;

public class CampaignHasKeyword {

	private long campaign_id;
	
	private long keyword_id;
	
	public CampaignHasKeyword(){
		this.campaign_id = 0;
		this.keyword_id = 0;
	}

	public CampaignHasKeyword(long campaign_id, long keyword_id) {
		super();
		this.campaign_id = campaign_id;
		this.keyword_id = keyword_id;
	}

	public long getCampaign_id() {
		return campaign_id;
	}

	public void setCampaign_id(long campaign_id) {
		this.campaign_id = campaign_id;
	}

	public long getKeyword_id() {
		return keyword_id;
	}

	public void setKeyword_id(long keyword_id) {
		this.keyword_id = keyword_id;
	}
	
}
