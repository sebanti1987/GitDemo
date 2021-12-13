package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.Login;
import resources.base;

public class HomePage extends base {
	
	public WebDriver driver;

	@BeforeTest

	public void initalize() throws IOException {
		driver = initializeDriver();

	}

	@Test(dataProvider = "getData")

	public void basePageNavigation(String Username, String Password, String text)throws IOException, InterruptedException {
		driver.get(prop.getProperty("url"));
		

		driver.manage().window().maximize();
		
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
		Thread.sleep(6000);
		Login l = new Login(driver);
		l.getEmail().sendKeys(Username);
		l.getPassword().sendKeys(Password);
		System.out.println(text);
		l.submitButton().click();
		Thread.sleep(1000);

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

	@DataProvider

	public Object[][] getData() {
		Object[][] data = new Object[2][3];
		data[0][0] = "nonrestricteduser@qw.com";
		data[0][1] = "123456";
		data[0][2] = "non restricted user";
		data[1][0] = "restricteduser@qw.com";
		data[1][1] = "890765";
		data[1][2] = "restricted user";

		return data;
	}

}
