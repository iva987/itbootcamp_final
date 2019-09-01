package pages.other_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BaseClass;

public class NewsPost extends BaseClass {
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public NewsPost(WebDriver d) {
		super(d);
	}
	
	//ELEMNTS
	
	private static WebElement edit() {
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/h1/a"));
	}
	
	private static WebElement reply() {
		return driver.findElement(By.cssSelector("div.box.well.well-sm div a:nth-child(1)"));
	}
	
	private static WebElement goBack() {
		return driver.findElement(By.cssSelector("div.box.well.well-sm div a:nth-child(2)"));
	}
	
	private static WebElement news() {
		return driver.findElement(By.cssSelector("td a"));
	}

	private static WebElement readFullText() {
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/a"));
	}
	
	//ACTIONS
	
	public void clickEdit() {
		edit().click();
	}
	
	public void clickReply() {
		reply().click();
	}
	
	public void clickGoBack() {
		goBack().click();
	}
	
	public void clickNews() {
		news().click();
	}
	
	public void clickReadFullText() {
		readFullText().click();
	}
}
