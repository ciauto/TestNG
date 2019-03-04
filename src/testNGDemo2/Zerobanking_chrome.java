package testNGDemo2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Zerobanking_chrome {
	WebDriver driver;

	@Test
	public void login(){
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.setCapability("chrome.switches",Arrays.asList("--no-default-browser-check")); 
	    HashMap<String, Boolean>chromePreferences = new HashMap<>(); 
	    chromePreferences.put("profile.password_manager_enabled", false);
	    options.setCapability("chrome.prefs", chromePreferences); 
	    ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://zero.webappsecurity.com/");
		driver.findElement(By.xpath("//*[@id='signin_button']")).click();
		driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("username");
		driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='login_form']/div[2]/input")).click();;
		driver.quit();
	}

}
