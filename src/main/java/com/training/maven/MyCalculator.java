package com.training.maven;

/**
 * @author CVRAMAN-536
 *
 */
public class MyCalculator {

	private MyCalculator() {
	}

	/**
	 * @param inputNumber1
	 * @param inputNumber2
	 * @return outputNumber
	 */
	public static int addition(int inputNumber1, int inputNumber2) {
		int outputNumber = inputNumber1 + inputNumber2;
		return outputNumber;
	}

}
