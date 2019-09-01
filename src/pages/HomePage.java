package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass {

	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public HomePage(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	
	private static List<WebElement> icons() {
		return driver.findElements(By.cssSelector("center.mt-big a"));
	}
	
	private static WebElement searchBox() {
		return driver.findElement(By.cssSelector("div.form-group input.form-control"));
	}
	
	private static List<WebElement> searchOptions() {
		return driver.findElements(By.cssSelector("div#search_options input"));
	}
	
	private static WebElement advanceSearch() {
		return driver.findElement(By.cssSelector("div#search_options a"));
	}
	
	private static WebElement goButton() {
		return driver.findElement(By.cssSelector("div.searchbar.searchbar-home button.btn"));
	}
	
	private static WebElement seeMore() {
		return driver.findElement(By.cssSelector("div.pull-right a.stealth"));
	}
	
	private static List<WebElement> topCollections() {
        return driver.findElements(By.cssSelector("div#ikind-search div.item-ia.collection-ia div.C234"));
    }
	
	//ACTIONS
	
	public List<WebElement> getIcons() {
		return icons();
	}
	
	public void clickIcons(Integer archive_icons) {
		getIcons().get(archive_icons).click();
	}
	
	public void clickSearchBox() {
		searchBox().click();
	}
	
	public void sendTextToSearchBox(String home_search) {
		searchBox().sendKeys(home_search);
	}
	
	public List<WebElement> getSearchOptions() {
		return searchOptions();
	}
	
	public void clickSearchOptions(Integer home_options) {
		getSearchOptions().get(home_options).click();
		
	}
	
	public void clickAdvanceSearch() {
		advanceSearch().click();
	}
	
	public void clickGoButton() {
		goButton().click();
	}
	
	public void clickSeeMore() {
		seeMore().click();
	}
	
	public List<WebElement> getTopCollections() {
		return topCollections();
	}
	
	public void clickTopCollestions(Integer top_collection) {
		getTopCollections().get(top_collection).click();
	}
	

}
