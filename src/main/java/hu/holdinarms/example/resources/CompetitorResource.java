package hu.holdinarms.example.resources;

import java.util.List;

import hu.holdinarms.example.core.Competitor;
import hu.holdinarms.example.dao.MyDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/competitor")
@Produces(MediaType.APPLICATION_JSON)
public class CompetitorResource {

	private MyDao myDao;
	
	public CompetitorResource( MyDao myDao ){
		this.myDao = myDao;
	}
	
//	@GET
//	public List<Competitor> getCompetitorList(){
//		return myDao.getCompetitorList();
//	}
}
