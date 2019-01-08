import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {

private FizzBuzz fizz ;
	

	void initialize()
	{
		this.fizz = new FizzBuzz() ;
	}
	
	@Test
	void shouldRetourneUnWhen1Test() 
	{
		assertTrue(this.fizz.getResult(1).equals("1")) ;
	}
	
	
	@Test
	void shouldRetourneDeuxWhen2Test()
	{
		assertTrue(fizz.getResult(2).equals("2")) ;
	}
	
	@Test
	void shouldRetourneFizzWhen3Test()
	{
		assertTrue(fizz.getResult(3).equals("Fizz")) ;
	}
	
	@Test
	void shouldRetourneBuzzWhen5Test()
	{
		assertTrue(fizz.getResult(5).equals("Buzz")) ;
	}
	
	@Test
	void shouldRetouneFizzwhen9Test()
	{
		assertTrue(fizz.getResult(9).equals("Fizz")) ;
	}
	
	@Test
	void shouldRetouneBuzzWhen10Test()
	{
		assertTrue(fizz.getResult(10).equals("Buzz")) ;
	}
	
	@Test
	void shouldRetourneFizzBuzzWhen15Test()
	{
		assertTrue(fizz.getResult(15).equals("FizzBuzz")) ;
	}
	
	@Test
	void shouldRetounrStringWhen0orOtherNumberTest()
	{
		assertTrue(fizz.getResult(0).equals("0")) ;
	}

}
