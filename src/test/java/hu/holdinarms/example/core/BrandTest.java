package hu.holdinarms.example.core;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The Brand test class.
 * 
 * @author Dgzt
 */
public class BrandTest {

	private Brand brand;
	
	@Before
	public void setUp(){
		brand = new Brand();
	}
	
	@Test
	public void test_constructor(){
		final long id = 10;
		final String name = "Test name";
		
		final Brand myBrand = new Brand(id,name);
		
		assertEquals( id, myBrand.getId() );
		assertEquals( name, myBrand.getName() );
	}
	
	@Test
	public void test_idSetAndGet(){
		final long id = 10;
		brand.setId(id);
		
		assertEquals( id, brand.getId() );
	}
	
	@Test
	public void test_nameSetAndGet(){
		final String name = "Test name";
		brand.setName(name);
		
		assertEquals( name, brand.getName() );
	}
}
