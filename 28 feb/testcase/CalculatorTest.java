package testcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	private static Calculator calculator;
	@BeforeClass
	public static void init() {
		calculator =new Calculator();
		System.out.println("Object created!!!");
	}
	@AfterClass
public static void destroy() {
	calculator=null;
	System.out.println("Object destroy!!!");
}
	@Test
	public  void test_add_success() {
		assertEquals(17, calculator.add(12, 5));
		System.out.println("inside test");
	}
	@Test
	public void test_sub_success() {
		assertEquals(7, calculator.sub(5, 12));
	}
	
	@Test
	public void test_mul_success() {
		assertEquals(60, calculator.mul(5, 12));
	}
	
	@Test
	public void test_div_success() {
		assertEquals(1, calculator.div(13, 12));
	}
	@Test
	public void test_isPrime_success() {
		assertEquals(true, calculator.isPrime(4));
	}
}
