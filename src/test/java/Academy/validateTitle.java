package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.Login;
import junit.framework.Assert;
import resources.base;

public class validateTitle extends base {
	public LandingPage lp;
	public WebDriver driver;
	
	@BeforeTest
	
	public void initalize() throws IOException {
		driver = initializeDriver();
		
		driver.get(prop.getProperty("url"));
	
		driver.manage().window().maximize();
		
	}
	@Test
	
	public void basePageNavigation() throws IOException, InterruptedException {
		
		 lp = new LandingPage(driver);
		System.out.println(lp.getTitle().getText());
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES");
		
		
	}
	
	@Test
	
	public void validateHeader() {
		System.out.println(lp.getHeader().getText());
		Assert.assertEquals(lp.getHeader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
			
		}
		
	
	
	@AfterTest
	
	public void teardown() {
		driver.close();
	}

}
