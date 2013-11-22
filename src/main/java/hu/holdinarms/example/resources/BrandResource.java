package hu.holdinarms.example.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.validator.constraints.NotEmpty;

import com.yammer.dropwizard.hibernate.UnitOfWork;

import hu.holdinarms.example.core.Brand;
import hu.holdinarms.example.dao.MyDao;

@Path("/brand")
public class BrandResource {
	
	private MyDao myDao;
	
	public BrandResource( MyDao myDao ){
		this.myDao = myDao;
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Brand> getBrands(){
		return myDao.getBrandList();
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public boolean addBrand( Brand newBrand ){
		myDao.insertToBrand( newBrand.getName() );
		return true;
	}
	
	@Path("{id}")
	@PUT
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public boolean updateBrand( @PathParam("id") String id, Brand updateBrand ){
		if( myDao.existsBrand( id ) ){
			myDao.updateBrand(id, updateBrand.getName() );
			return true;
		}else{
			return false;
		}
	}
	
}
