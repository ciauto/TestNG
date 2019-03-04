package fileUpload;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.awt.AWTException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class FileuploadAutoIT {
	private WebDriver driver;
	private String baseUrl;

	@BeforeTest
	public void beforeClass() throws MalformedURLException {
		baseUrl = "https://www.gmail.com/";
		System.setProperty("webdriver.gecko.driver", "c:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();;
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@Test
	public void fileUpload() throws AWTException, InterruptedException, IOException {
		
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("nareshpraj@gmail.com");
		WebDriverWait wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Next')]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys("xxxxxxx");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Next')]"))).click();
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("nareshpraj@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Testing File Upload");
		WebElement fileInput = driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']"));
		fileInput.click();
		Runtime.getRuntime().exec("C:\\AutoITScript\\fileupload.exe");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(7000);
	}

	@AfterTest
	public void afterClass() {
		driver.quit();
	
	}

}