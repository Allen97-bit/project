package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	@Parameters({ "email", "pass" })
	@Test
	public void tc1(String email, String pass) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ALLEN AKASH A\\eclipse-workspace\\maven\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys(email);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(pass);
	}

	@Test
	public void tc2() {
		System.out.println("tc 2");
	}

	@Test
	public void tc3() {
		System.out.println("tc 3");
	}

}
