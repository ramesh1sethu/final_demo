package com.training.maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTests2 {
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
		System.out.println("*****IN Testcase modify");
		Assert.assertTrue(true);
	}
}
