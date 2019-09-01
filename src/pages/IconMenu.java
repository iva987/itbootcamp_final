package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class IconMenu extends BaseClass {

	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public IconMenu(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	
	private static List<WebElement> icons() {
		return driver.findElements(By.cssSelector("li.dropdown.dropdown-ia.pull-left a"));
	}
	
	public static WebElement logo() {
		return driver.findElement(By.cssSelector("ul.nav span.iconochive-logo"));
	}
	
	public static WebElement signIn() {
		return driver.findElement(By.cssSelector("ul.nav a.nav-user span.hidden-xs-span"));
	}
	
	public static WebElement userName() {
		return driver.findElement(By.cssSelector("li.dropdown-ia.pull-right.leftmost span"));
	}
	
	public static WebElement upload() {
		return driver.findElement(By.cssSelector("ul.nav span.iconochive-upload"));
	}
	
	public static WebElement searchField() {
		return driver.findElement(By.cssSelector("input#search-bar-2"));
	}
	
	public static List<WebElement> searchOptions() {
		return driver.findElements(By.cssSelector("div#navbar_search_options input"));
	}
	
	public static WebElement advancedSearch() {
		return driver.findElement(By.cssSelector("div#navbar_search_options a"));
	}
		
		
	//ACTIONS
	//Menu
	public List<WebElement> getIcons() {
		return icons();
	}
		
	public void clickIcons(Integer menu_icon) {
		getIcons().get(menu_icon).click();
	}

	
	public void clickLogo() {
		logo().click();
	}

	
	public void clickSignIn() {
		signIn().click();
	}
	
	public void clickUserName() {
		userName().click();
	}
	
	public void clickUpload() {
		upload().click();
	}
	
	public void clickSearchField() {
		searchField().click();
	}
	
	public void sendTextToSearchField(String search_term) {
		searchField().sendKeys(search_term);
		searchField().sendKeys(Keys.ENTER);
	}
	
	public List<WebElement> getSearchOptions() {
		return searchOptions();
	}
	
	public void clickSearchOptions(Integer search_options) {
		getSearchOptions().get(search_options).click();
	}
	
	public WebElement getAdvancedSearch() {
		return this.visibilityOfElementLocated(By.cssSelector("div#navbar_search_options a"));
	}
	
	public void clickAdvancedSearch() {
		getAdvancedSearch().click();
	}

}
