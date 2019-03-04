package testNGDemo2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Zerobanking_ff {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void login(){
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setAcceptInsecureCerts(true);
		driver=new FirefoxDriver(cap);
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
