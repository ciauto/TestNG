package testNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_crossBrowserTest {
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void login(String browserName) {

		if (browserName.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver-v0.20\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\driver\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://zero.webappsecurity.com/");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
