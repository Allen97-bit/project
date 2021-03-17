package maven;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ALLEN AKASH A\\eclipse-workspace\\maven\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public static void afterClass() {

		driver.close();
	}

	@Before
	public void beforeMethod() {
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void afterMethod() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void tc1() {
		driver.get("https://www.facebook.com/");
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("welcome");
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys("123");
	}

	@Test
	public void tc2() {
		driver.get("https://www.facebook.com/");
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("welsea");
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys("123java");
	}

	@Test
	public void tc3() {
		driver.get("https://www.facebook.com/");
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("welcome");
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys("allen@123");
	}

}
