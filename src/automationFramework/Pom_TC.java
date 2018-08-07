package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.Home_Page;
import pageObjects.LogIn_Page;

public class Pom_TC {
	private static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
		Home_Page.lnk_Account(driver).click();
		LogIn_Page.Username(driver).sendKeys("testuser_1");
		LogIn_Page.Password(driver).sendKeys("Test@123");
		LogIn_Page.Btn_LogIn(driver).click();
		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	   //  Home_Page.lnk_LogOut(driver).click(); 
	 
	  //   driver.close();

	}

}
