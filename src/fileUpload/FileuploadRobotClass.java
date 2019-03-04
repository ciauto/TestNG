package fileUpload;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class FileuploadRobotClass {
	private WebDriver driver;
	private String baseUrl;

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		baseUrl = "https://www.gmail.com/";
		System.setProperty("webdriver.gecko.driver", "c:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();;
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@Test
	public void fileUpload() throws AWTException, InterruptedException {
		//driver.findElement(By.xpath("//a[contains(.,'Sign In')]")).click();
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("your email address");
		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("your password");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("nareshpraj@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Testing File Upload");
		WebElement fileInput = driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']"));
		fileInput.click();
		StringSelection s = new StringSelection("C:\\Users\\Naresh\\Desktop\\test.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		// Ctrl + v (this will attach the file content)
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	
	}

}