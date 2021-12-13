package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	private By signin = By.cssSelector("a[href*='sign_in']");
	private By title = By.cssSelector(".text-center>h2");
	private By navbar = By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	
	private By header = By.cssSelector("div[class*='video-banner'] h3");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getLogin() {
		return driver.findElement(signin);
		
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
		
	}
	
	public WebElement getNavBar() {
		System.out.println("trying to identify nav bar");
		return driver.findElement(navbar);
		
	}
	
	public WebElement getHeader() {
		
		return driver.findElement(header);
		
	}
	

}
