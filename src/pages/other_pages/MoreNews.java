package pages.other_pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BaseClass;

public class MoreNews extends BaseClass {
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public MoreNews(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	
	private static List<WebElement> moreNews() {
		return driver.findElements(By.cssSelector("tr.forumRow"));
	}
	
	private static WebElement mailIcon() {
		return driver.findElement(By.cssSelector("span.iconochive-email"));
	}
	
	//ACTIONS
	
	public List<WebElement> getNews() {
		return moreNews();
	}
	
	public void sizeNews() {
		getNews().size();
	}
	
	public List<WebElement> titleNews() {
	       List<WebElement> allTitles = getNews();
	       List<WebElement> titles = new ArrayList<WebElement>();
	        
	       for (int i = 0; i < allTitles.size(); i++) {
	           WebElement title = allTitles.get(i).findElement(By.cssSelector("td:nth-child(1) a"));
	           titles.add(title);
	       }
	       return titles;    
	}
	
	public void clickTitleNews(Integer title_news) {
		titleNews().get(title_news).click();
	}
	
	public void clickIcon() {
		mailIcon().click();
	}

}
