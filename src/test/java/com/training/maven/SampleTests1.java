package com.training.maven;

import org.testng.Assert;
import org.testng.annotations.Test;
// demo test class for checking test cases 
public class SampleTests1 {
	@Test
	public void testcase01() {
		System.out.println("*****IN TESTCASE01");
		Assert.assertTrue(true);
	}

	@Test
	public void testcase02() {
		System.out.println("*****IN TESTCASE02");
		Assert.assertTrue(true);
	}

	@Test
	public void testcase03() {
		System.out.println("*****IN TESTCASE03");
		Assert.assertTrue(true);
	}

	@Test
	public void testcase04() {
		System.out.println("*****IN TESTCASE04");
		Assert.assertTrue(true);
	}
}
