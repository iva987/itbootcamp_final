package pages.other_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import pages.BaseClass;

public class LogInPage extends BaseClass {
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public LogInPage(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	
	private static WebElement signUp() {
		return driver.findElement(By.cssSelector("section.login-header a"));
	}
	
	private static WebElement username() {
		return driver.findElement(By.name("username"));
	}
	
	private static WebElement password() {
		return driver.findElement(By.name("password"));
	}
	
	private static WebElement seePasswordIcon() {
		return driver.findElement(By.cssSelector("img.password_icon"));
	}
	
	private static WebElement forgotPassword() {
		return driver.findElement(By.cssSelector("span.reset-password a"));
	}
	
	private static WebElement keepLoogedIn() {
		return driver.findElement(By.name("remember"));
	}
	
	private static WebElement signInButton() {
		return driver.findElement(By.name("submit-to-login"));
	}
	
	//ACTIONS
	
	public void clickSignUp() {
		signUp().click();
	}
	
	public void sendTextToUsername(String username) {
		username().sendKeys(username);
	}
	
	public void sendTextToPassword(String password) {
		password().sendKeys(password);
	}
	
	public void clickSeePasswordIcon() {
		seePasswordIcon().click();
	}
	
	public void clickForgotPassword() {
		forgotPassword().click();
	}
	
	public void clickKeepLogedIn() {
		keepLoogedIn().click();
	}
	
	public void clickSignInButton() {
		signInButton().click();
	}
	
}
