package maven;

import org.testng.annotations.Test;

public class Group2 {
@Test(groups="sanity")
public void tc11() {
System.out.println("TC 11");
}
@Test(groups="regression")
public void tc22() {
System.out.println("TC 22");
}
@Test(groups="smoke")
public void tc33() {
System.out.println("TC 33");
}
}
