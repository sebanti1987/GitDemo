package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.Login;
import junit.framework.Assert;
import resources.base;



public class validateBar extends base {
	
	public WebDriver driver;
	
	@BeforeTest
	 public void initalize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		
	}
	@Test
	
	public void basePageNavigation() throws IOException, InterruptedException {
		
		LandingPage lp = new LandingPage(driver);
		Assert.assertTrue(lp.getNavBar().isDisplayed());
		
	}
	
	@AfterTest
	
	public void teardown() {
		driver.close();
	}

}
