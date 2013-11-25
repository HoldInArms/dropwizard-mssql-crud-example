package hu.holdinarms.example.core;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The Keyword test class.
 * 
 * @author Dgzt
 */
public class KeywordTest {

	private Keyword keyword;
	
	@Before
	public void setUp(){
		keyword = new Keyword();
	}
	
	@Test
	public void test_constructor(){
		final long id = 10;
		final String name = "Test name";
		final Keyword myKeyword = new Keyword(id,name);
		
		assertEquals( id, myKeyword.getId() );
		assertEquals( name, myKeyword.getName() );
	}
	
	@Test
	public void test_idSetAndGet(){
		final long id = 10;
		keyword.setId(id);
		
		assertEquals( id, keyword.getId() );
	}
	
	@Test
	public void test_nameSetAndGet(){
		final String name = "Test name";
		keyword.setName(name);
		
		assertEquals( name, keyword.getName() );
	}
}
