package hu.holdinarms.example.resources;

import java.util.List;

import hu.holdinarms.example.core.CampaignHasKeyword;
import hu.holdinarms.example.dao.MyDao;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("campaignhaskeyword")
public class CampaignHasKeywordResource {

	private MyDao myDao;

	public CampaignHasKeywordResource(MyDao myDao) {
		this.myDao = myDao;
	}
	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<CampaignHasKeyword> getCampaignHasKeywords(){
//		return myDao.getCampaignHasKeywordList();
//	}
//	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	public void addCampaignHasKeyword( CampaignHasKeyword campaignHasKeyword ){
//		myDao.insertToCampaignHasKeyword( campaignHasKeyword.getCampaign_id(), campaignHasKeyword.getKeyword_id() );
//	}
	
}
