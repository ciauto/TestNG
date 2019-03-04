package testNGDemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_MercuryTour2 {
	public WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	
	}
	@Test
	public void verifyHomePageTitle() {
		String expected="Welcome: Mercury Tours";
		String actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
		
		
	}
	
	@Test
	public void verifyLogin() {
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		Assert.assertTrue(isElementPresent(By.xpath("//a[@href='mercurysignoff.php']")));
		}
	
	@AfterSuite
	public void tearDown() {
	driver.quit();
		
		
	}
	
	public boolean isElementPresent(By by) {
		
		try
		{
			driver.findElement(by);
			return true;
		}catch(NoSuchElementException e) {
			return false;
		}
		
	
	}

}
