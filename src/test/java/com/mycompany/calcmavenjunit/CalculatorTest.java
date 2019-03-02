package com.mycompany.calcmavenjunit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Stefan Ohlsson
 */
public class CalculatorTest {

	Calculator calculator = new Calculator();

	public CalculatorTest() {
	}

	/**
	 * Test of add method, of class Calculator.
	 */
	@Test
	public void testAdd() {
		System.out.println("add");
		assertEquals(98, calculator.add(88, 10));
	}

	/**
	 * Test of subtract method, of class Calculator.
	 */
	@Test
	public void testSubtract() {
		System.out.println("subtract");
		assertEquals(0, calculator.subtract(2, 2));
	}

	/**
	 * Test of multiply method, of class Calculator.
	 */
	@Test
	public void testMultiply() {
		System.out.println("multiply");
		assertEquals(12, calculator.multiply(2, 6));
	}

	/**
	 * Test of divide method, of class Calculator.
	 */
	@Test
	public void testDivide() {
		System.out.println("divide");
		assertEquals(1, calculator.divide(2, 2));

	}

}
