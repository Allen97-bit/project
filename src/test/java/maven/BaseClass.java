package maven;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	static WebDriver driver;

	public static void browserConfig() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ALLEN AKASH A\\eclipse-workspace\\Employee\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void borwserLaunch(String url) {
		driver.get(url);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void type(WebElement w, String value) {
		w.sendKeys(value);
	}

	public static void click(WebElement w) {
		w.click();
	}

	public static void getCurrentUrl() {
		driver.getCurrentUrl();
	}

	public static void getTitle() {
		driver.getTitle();
	}

	public static void actions(WebElement w) {
		Actions a = new Actions(driver);
		a.moveToElement(w).perform();
	}

	public static void rightClick(WebElement w) {
		Actions a = new Actions(driver);
		a.contextClick(w).perform();
	}

	public static void doubleClick(WebElement w) {
		Actions a = new Actions(driver);
		a.doubleClick(w).perform();
	}

	public static void clickUsingActions(WebElement w) {
		Actions a = new Actions(driver);
		a.click(w).perform();
	}

	public static void dragAndDrop(WebElement source, WebElement dest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, dest).perform();
	}

	public static void clickAndHold(WebElement w) {
		Actions a = new Actions(driver);
		a.clickAndHold(w).perform();
	}

	public static void release(WebElement w) {
		Actions a = new Actions(driver);
		a.release(w).perform();
	}

	public static void selectByIndex(WebElement element, int i) {
		Select s = new Select(element);
		s.selectByIndex(i);
	}

	public static void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void selectByVisibleText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void getAttribute(WebElement element, String value) {
		String text = element.getAttribute(value);
		System.out.println(text);
	}

	public static void screenshot(String data) throws IOException{
		 
			TakesScreenshot t = (TakesScreenshot) driver;
			File source = t.getScreenshotAs(OutputType.FILE);
			File dest = new File(System.getProperty("user.dir")+"//target//"+data+".png");
			FileUtils.copyFile(source, dest);
	}

	public static void scrollDown(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void scrollUp(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public static void javaScriptType(WebElement element, String text) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value','text')", element);
	}

	public static void javaScriptClick(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click()", element);
	}
	public void setWrite(WebElement element,String data) {
	JavascriptExecutor j =(JavascriptExecutor)driver;
	j.executeScript("arguments[0].setAttribute('value',"+data+")", element);

	}

	public static void WindowsHandling() {
		String parentwindow = driver.getWindowHandle();
		Set<String> allwimdows = driver.getWindowHandles();
		for (String s : allwimdows) {
			if (!parentwindow.equals(s)) {
				driver.switchTo().window(s);

			}

		}

	}

	public static void alertAccept() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public static void alertDismiss() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	public static void alertSendKeys(String text) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(text);
		al.accept();
	}

	public static void alertText() {
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
	}

	public static void closeWindow() {
		driver.close();
	}

	public static void quitWindow() {
		driver.quit();
	}

}
