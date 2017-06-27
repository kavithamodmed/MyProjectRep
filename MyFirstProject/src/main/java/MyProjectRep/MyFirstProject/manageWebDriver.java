package MyProjectRep.MyFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class manageWebDriver {
	
	private static WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "/usr/local/Cellar/chromedriver/2.29/bin/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("ingnore-certificate-errors");
		chromeOptions.addArguments("test-type");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		driver = new ChromeDriver(chromeOptions);
	}

	
	@AfterTest
	public void afterTest(){
		driver.quit();
	}
	
	public void click(String xPath){
		driver.findElement(By.xpath(xPath)).click();
	}
	
	public void sendText(String xPath, String value){
		driver.findElement(By.xpath(xPath)).sendKeys(value);
	}
	
	public void navigateTo(String url){
		driver.get(url);
	}
	
	public String getText(String xPath){
		return driver.findElement(By.xpath(xPath)).getText();
	}
}


