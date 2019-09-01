package pages.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.IconMenu;
import pages.URLPages;
import pages.other_pages.LogInPage;

import org.testng.Assert;

public class Test5 {
	
	public static final String USERNAME = "foo@gmail.com";
	public static final String PASSWORD = "bar";

	public WebDriver d;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Iva\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		d = new FirefoxDriver();
	}
	
	
	@Test
	public void internetArchiveTest5() throws Exception{
		
		d.navigate().to(URLPages.HOME_PAGE);
		new IconMenu(d).clickSignIn();
		Boolean button = d.findElement(By.name("submit-to-login")).isDisplayed();
		Assert.assertTrue(button, "Log In button is not visible.");
		
		new LogInPage(d).sendTextToUsername(USERNAME);
		new LogInPage(d).sendTextToPassword(PASSWORD);
		new LogInPage(d).clickSignInButton();
		Thread.sleep(2000);
		
		String text = "Email address and/or Password incorrect.";
		WebElement message = d.findElement(By.cssSelector("span.login-error.password-error"));
		Assert.assertTrue(message.getText().contains(text));
		
		d.close();
	}
}
