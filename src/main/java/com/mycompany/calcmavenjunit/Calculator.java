package com.mycompany.calcmavenjunit;

public class Calculator {

	public int add(int term1, int term2) {
		return term1 + term2;
	}

	public int subtract(int term1, int term2) {
		return term1 - term2;
	}

	public int multiply(int term1, int term2) {
		return term1 * term2;
	}

	public int divide(int term1, int term2) {
		return term1 / term2;
	}

	public int modulus(int term1, int term2) {
		return term1 % term2;
	}

	public double percentOf(int term1, int term2) {
		// System.out.println(term1*.01 * term2);
		return ((term1 * .01) * term2);
	}

}
