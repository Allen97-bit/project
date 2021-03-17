package maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("starts before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("starts after method");
	}

	@Test
	public void tc1() {
		System.out.println("TC 1");
	}

	@Test
	public void tc2() {
		System.out.println("TC 2");
	}

	@Test
	public void tc3() {
		System.out.println("TC 3");
	}

}
