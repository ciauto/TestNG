package listenerDemo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerDemo.Listener_Test.class)

public class LoginTestCase_Annot {
	
	WebDriver driver;
	String baseURL;

	@Test
	public void login() {
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	baseURL = "http://zero.webappsecurity.com/";
	// Maximize the browser's window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(baseURL);
	driver.findElement(By.id("signin_button")).click();
	driver.findElement(By.id("user_login")).sendKeys("username");
	driver.findElement(By.id("user_password")).sendKeys("password");
	driver.findElement(By.name("submit")).click();
		}
	@Test
	public void purchaseticket() {
		System.out.println("Purchaseticket method test fail");					
	    Assert.assertTrue(false);
		}

	
}
