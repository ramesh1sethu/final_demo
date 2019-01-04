package com.training.maven;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author CVRAMAN-536
 *
 */
public class SampleTests1 {
	/**
	 * Positive scenario
	 */
	@Test
	public void additionTest01() {
		int expected = 10;
		int actula = MyCalculator.addition(6, 4);
		Assert.assertEquals(expected, actula);
	}

	/**
	 * 
	 */
	@Test
	public void testcase02() {
		System.out.println("*****IN TESTCASE02");
		Assert.assertTrue(true);
	}

	/**
	 * 
	 */
	@Test
	public void testcase03() {
		System.out.println("*****IN TESTCASE03");
		Assert.assertTrue(true);
	}

	/**
	 * 
	 */
	@Test
	public void testcase04() {
		System.out.println("*****IN TESTCASE04");
		Assert.assertTrue(true);
	}
}
