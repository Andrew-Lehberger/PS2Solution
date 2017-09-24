package pkgMain;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyIntegerTest {

	@Test
	public void testEven() {
		
		MyInteger myInt = new MyInteger(2);
		
		
		assertTrue(myInt.isEven());
		
		assertFalse(myInt.isEven(3));
	}
		

	
	@Test
	public void testOdd() {
		MyInteger myInt = new MyInteger(2);
		
		assertFalse(myInt.isOdd());
		
		assertTrue(myInt.isOdd(3));
		
	}
	
	@Test
	public void testPrime() {
		MyInteger myInt = new MyInteger(17);
		
		assertTrue(myInt.isPrime());
		
		assertTrue(myInt.isPrime(1));
		
		assertTrue(myInt.isPrime(2));
		
		assertFalse(myInt.isPrime(4));
		
	
	}
	
	@Test
	public void testEquals() {
		MyInteger myInt = new MyInteger(20);
		
		assertTrue(myInt.isEquals(20));
		
		assertFalse(myInt.isEquals(200));
	}
	
	
	
	}
	
		
		

