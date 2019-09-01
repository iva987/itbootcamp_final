package pages.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.IconMenu;
import pages.URLPages;

public class Test4 {
	
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
		new IconMenu(d).clickUpload();
		WebElement text = d.findElement(By.cssSelector("p"));
		String a = "Log in or Sign up";
		Assert.assertTrue(text.getText().contains(a), "Thera aro no Log in or Sign up on the page.");
		
		Thread.sleep(2000);
		d.close();
		
	}

}
