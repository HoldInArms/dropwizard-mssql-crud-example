package hu.holdinarms.example.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import hu.holdinarms.example.core.Brand;
import hu.holdinarms.example.dao.MyDao;

@Path("/brand")
@Produces(MediaType.APPLICATION_JSON)
public class BrandResource {
	
	private MyDao myDao;
	
	public BrandResource( MyDao myDao ){
		this.myDao = myDao;
	}
	
	@GET
	public List<Brand> getBrands(){
		return myDao.getBrandList();
	}

	@POST
	@Path("{name}")
	public boolean addBrand(@PathParam("name") String name ){
		myDao.insertToBrand(name);
		
		return true;
	}
	
}
