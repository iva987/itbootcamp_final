package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpPage extends BaseClass {
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public HelpPage(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	
	private static WebElement searchBox() {
		return driver.findElement(By.cssSelector("query"));
	}
	
	private static List<WebElement> buttons() {
		return driver.findElements(By.cssSelector("li.blocks-item a"));
	}
	
	private static WebElement signIn() {
		return driver.findElement(By.cssSelector("a.login"));
	}
	
	//ACTIONS
	
	public void sendTextToSearchBox(String help_search) {
		searchBox().sendKeys(help_search);
		searchBox().sendKeys(Keys.ENTER);
	}
	
	public List<WebElement> getButtons() {
		return buttons();
	}
	
	public void clickButtons(Integer help_buttons) {
		getButtons().get(help_buttons).click();
	}
	
	public void clickSignIn() {
		signIn().click();
	}

}
