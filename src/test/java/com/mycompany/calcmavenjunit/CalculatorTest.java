package com.mycompany.calcmavenjunit;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

/**
 *
 * @author Stefan Ohlsson
 */
public class CalculatorTest {

	private static final double delta = 0.0000001;
	Calculator calculator;

	public CalculatorTest() {
	}
	
	// anropas före varje test-metod
	@Before
	public void createCalculator() {
		calculator = new Calculator();
	}
	/**
	 * Test of add method, of class Calculator.
	 */
	@Test
	public void testAdd() throws Exception {
		
		assertEquals(98, calculator.add(88, 10));

	}

	/**
	 * Test of subtract method, of class Calculator.
	 */
	@Test
	public void testSubtract() {

		assertEquals(0, calculator.subtract(2, 2));
	}

	/**
	 * Test of multiply method, of class Calculator.
	 */
	@Test
	public void testMultiply() {
		assertEquals(12, calculator.multiply(2, 6));
	}

	/**
	 * Test of divide method, of class Calculator.
	 */
	@Test
	public void testDivide() {
		assertEquals(1, calculator.divide(2, 2));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideWithZero() {
		calculator.divide(2, 0);
	}

	/**
	 * Test of modulus method, of class Calculator.
	 */

	@Test
	public void testModulus() {
		assertEquals(0, calculator.modulus(2, 2));
	}

	/**
	 * Test of percentOf method, of class Calculator.
	 */

	@Test
	public void testPercentOf() {
		double calcResult = calculator.percentOf(10, 100);
		assertEquals(10.0, calcResult, delta);
	}

}
