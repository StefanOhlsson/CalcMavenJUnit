package com.mycompany.calcmavenjunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stefan Ohlsson
 */
public class CalculatorTest {

    public CalculatorTest() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int term1 = 4;
        int term2 = 5;
        Calculator instance = new Calculator();
        int expResult = 9;
        int result = instance.add(term1, term2);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int term1 = 9;
        int term2 = 4;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.subtract(term1, term2);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int term1 = 7;
        int term2 = 7;
        Calculator instance = new Calculator();
        int expResult = 49;
        int result = instance.multiply(term1, term2);
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int term1 = 8;
        int term2 = 4;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.divide(term1, term2);
        assertEquals(expResult, result);

    }

}
