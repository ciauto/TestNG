package fileUpload;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PasswordEncryptionGmail {

	public static void main (String[] args) throws InterruptedException, IOException{
			WebDriver driver;
			String baseUrl;
			baseUrl = "https://www.gmail.com/";
			driver = new FirefoxDriver();;
			// Maximize the browser's window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(baseUrl);
			driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("xxxxx@xxxx.com");
			driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
			String encodedpass = "YWJjZDEyMzQ=";
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(decodeStr(encodedpass));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
			driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
			driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("xxxxxx@gmail.com");
			driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Testing File Upload");
			WebElement fileInput = driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']"));
			fileInput.click();
			Runtime.getRuntime().exec("C:\\Users\\Naresh\\Documents\\AutoITScripts\\fileuploadgmail.exe");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[text()='Send']")).click();
			Thread.sleep(7000);
			driver.quit();
	}
	
	public static String decodeStr(String encodedStr){
		byte[] decoded=Base64.decodeBase64(encodedStr);
		return new String(decoded);
	}
}