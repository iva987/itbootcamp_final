package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPage extends BaseClass {
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public AboutPage(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	
	private static List<WebElement> pageNews() {
		return driver.findElements(By.cssSelector("div.box a"));
	}
	
	private static WebElement moreButton() {
		return driver.findElement(By.cssSelector("div.box h1 a"));
	}
	
	//ACTIONS
	
	public List<WebElement> getPageNews() {
		return pageNews();
	}
	
	public void sizeNews() {
		getPageNews().size();
	}

	public void clickPageNews(Integer about_news) {
		getPageNews().get(about_news).click();
	}
	
	public void clickMoreButton() {
		moreButton().click();
	}
}