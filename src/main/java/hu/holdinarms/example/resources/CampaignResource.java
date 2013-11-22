package hu.holdinarms.example.resources;

import java.util.List;

import hu.holdinarms.example.core.Campaign;
import hu.holdinarms.example.dao.MyDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/campaign")
@Produces(MediaType.APPLICATION_JSON)
public class CampaignResource {

	private MyDao myDao;
	
	public CampaignResource( MyDao myDao ){
		this.myDao = myDao;
	}
	
	@GET
	public List<Campaign> getCampaings(){
		return myDao.getCampaingList();
	}
	
}
