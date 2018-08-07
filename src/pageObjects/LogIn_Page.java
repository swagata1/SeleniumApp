package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn_Page {
	private static WebElement element=null;
	public static WebElement Username(WebDriver driver) {
		element=driver.findElement(By.id("log"));
		return element;
	}
	public static WebElement Password(WebDriver driver) {
		element=driver.findElement(By.id("pwd"));
		return element;
	}
	public static WebElement Btn_LogIn(WebDriver driver) {
		element=driver.findElement(By.id("login"));
		return element;
	}
	

}
