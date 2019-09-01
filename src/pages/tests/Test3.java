package pages.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.URLPages;

public class Test3 {
	
	public static final String HOME_SEARCH = "qa";
	
	public WebDriver d;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Iva\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		d = new FirefoxDriver();
	}
	
	@Test
	public void internetArchiveTest() throws Exception{
		
		d.navigate().to(URLPages.HOME_PAGE);
		new HomePage(d).clickSearchBox();
		
		Boolean visible = d.findElement(By.cssSelector("div#search_options input")).isDisplayed();
		Assert.assertTrue(visible, "Dropdown is not visible."); // proverava da li je dropdown vidljiv
		
		new HomePage(d).sendTextToSearchBox(HOME_SEARCH);
		new HomePage(d).clickGoButton();
		Thread.sleep(2000);
		String search = "?query=qa";
		Assert.assertTrue(d.getCurrentUrl().contains(search)); // proverava da li u url postoji zadati string
		
		Thread.sleep(2000);
		d.close();
	}

}
