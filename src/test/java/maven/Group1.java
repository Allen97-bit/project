package maven;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups = "smoke")
	public void tc1() {
		System.out.println("TC 1");
	}

	@Test(groups = "rerun")
	public void tc2() {
		System.out.println("TC 2");
	}

	@Test(groups = "regression")
	public void tc3() {
		System.out.println("TC 3");
	}
	private void tc5() {

	}
	
	private void tc9() {

	}
	
}
