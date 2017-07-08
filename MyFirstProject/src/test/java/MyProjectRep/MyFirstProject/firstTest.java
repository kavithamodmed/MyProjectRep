package MyProjectRep.MyFirstProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstTest extends manageWebDriver{
	@Test
	public void sampleTestFail() throws IOException{
		navigateTo("https://derm.m2qa-next.com");
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id = 'username']")));
		sendText("//input[@id = 'username']", "jdoe");
		sendText("//input[@id = 'password']", "changeme");
		click("//button[@name = 'login']");
		Assert.assertEquals(getText("//span[@id = 'firmName']"), "Demo Dermatology");
	}
	
	@Test
	public void sampleTestPass() throws IOException{
		navigateTo("https://derm.m2qa-next.com");
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id = 'username']")));
		sendText("//input[@id = 'username']", "jdoe");
		sendText("//input[@id = 'password']", "Changeme1");
		click("//button[@name = 'login']");
		Assert.assertEquals(getText("//span[@id = 'firmName']"), "Demo Dermatology");
	}
	
	@Test
	public void sampleTest(){
		
	}
}


