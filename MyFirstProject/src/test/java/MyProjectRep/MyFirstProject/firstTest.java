package MyProjectRep.MyFirstProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class firstTest extends manageWebDriver{
	@Test
	public void sampleTestFail() throws IOException{
		navigateTo("https://derm.m2qa-next.com");
		sendText("//input[@id = 'username']", "jdoe");
		sendText("//input[@id = 'password']", "changeme");
		click("//button[@name = 'login']");
		Assert.assertEquals(getText("//span[@id = 'firmName']"), "Demo Dermatology");
	}
	
	@Test
	public void sampleTestPass() throws IOException{
		navigateTo("https://derm.m2qa-next.com");
		sendText("//input[@id = 'username']", "jdoe");
		sendText("//input[@id = 'password']", "Changeme1");
		click("//button[@name = 'login']");
		Assert.assertEquals(getText("//span[@id = 'firmName']"), "Demo Dermatology");
	}
}


