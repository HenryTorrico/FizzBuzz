import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class FizzBuzzTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testForFizzBuzz() {
		Program fizzBuzz = new Program(); 
		Assert.assertEquals("FizzBuzz", fizzBuzz.main(15)); 
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testForFizz() {
		Program fizzBuzz = new Program(); 
		Assert.assertEquals("Fizz", fizzBuzz.main(3)); 
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testForBuzz() {
		Program fizzBuzz = new Program(); 
		Assert.assertEquals("Buzz", fizzBuzz.main(5)); 
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testForNoOne() {
		Program fizzBuzz = new Program(); 
		Assert.assertEquals("7", fizzBuzz.main(7)); 
	}

}
