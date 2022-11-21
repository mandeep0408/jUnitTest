package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitstrings = new jUnitFunctions();
		String result = junitstrings.addstring("capstone", "project");
		assertEquals("capstoneproject", result);
	}

}
