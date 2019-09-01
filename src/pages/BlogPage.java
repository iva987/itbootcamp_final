package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BlogPage extends BaseClass {
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public BlogPage(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	
	private static List<WebElement> menu() {
		return driver.findElements(By.cssSelector("div#access ul#menu-menu a"));
	}
	
	private static List<WebElement> socialMedia() {
		return driver.findElements(By.cssSelector("li#archive_sharing_widget-4 img"));
	}
	
	private static WebElement archiveDropdown() {
		return driver.findElement(By.name("archive-dropdown"));
	}
	
	private static WebElement searchBox() {
		return driver.findElement(By.cssSelector("input#s"));
	}
	
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("input#searchsubmit"));
	}
	
	//nakon search-a
	private static List<WebElement> searchResult() {
		return driver.findElements(By.cssSelector("div#content div.post.type-post.status-publish.format-standard"));
	}
	
	//ACTIONS
	
	public List<WebElement> getMenu() {
		return menu();
	}
	
	public void clickMenu(Integer blog_menu) {
		getMenu().get(blog_menu).click();
	}
	
	public List<WebElement> getSocialMedia() {
		return socialMedia();
	}
	
	public void clickSocialMedia(Integer social_media) {
		getSocialMedia().get(social_media).click();
	}
	
	public void archiveDropdown(String month_year) {
		Select aDropdown = new Select(archiveDropdown());
		aDropdown.selectByVisibleText(month_year);
	}
	
	public void sendTextToSearchBox(String blog_search) {
		searchBox().sendKeys(blog_search);
	}
	
	public void clickSearchButton() {
		searchButton().click();
	}
	
	public List<WebElement> getSearchResult() {
		return searchResult();
	}
	
	public void clickSearchResult(Integer search_result) {
		getSearchResult().get(search_result).click();
	}

}
