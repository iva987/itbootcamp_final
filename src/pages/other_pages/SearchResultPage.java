package pages.other_pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BaseClass;

public class SearchResultPage extends BaseClass {
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public SearchResultPage(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	
	private static List<WebElement> searchResultList() {
		return driver.findElements(By.cssSelector("div:not(.mobile-header).item-ia.hov"));
	}

	//ACTIONS
	
	public List<WebElement> getResults() {
		return searchResultList();
	}
}
