package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobsPage extends BaseClass {
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public JobsPage(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	
	private static WebElement searchBox() {
		driver.switchTo().frame("resumator-job-frame");
		return driver.findElement(By.cssSelector("input#q"));
	}
	
	private static WebElement searchButton() {
		driver.switchTo().frame("resumator-job-frame");
		return driver.findElement(By.cssSelector("a#btn_search_jobs"));
	}
	
	private static WebElement advaneSearch() {
		driver.switchTo().frame("resumator-job-frame");
		return driver.findElement(By.cssSelector("a#link_show_advanced_search span"));
	}
	
	private static List<WebElement> listElements() {
	     driver.switchTo().frame("resumator-job-frame");
	     return driver.findElements(By.cssSelector("table#jobs_table tr:not(:nth-child(1))"));
	}
	
	//ACTIONS
	
	public void sendTextToSearchBox(String jobs_search) {
		searchBox().sendKeys(jobs_search);
	}
	
	public void clickSearchButton() {
		searchButton().click();
	}
	
	public void clickAdvanceSearch() {
		advaneSearch().click();
	}
	
	public List<WebElement> getListElements() {
		return listElements();
	}
	
	public void sizeListElement() {
		getListElements().size();
	}

	public void clickListElement(Integer job_list) {
		getListElements().get(job_list).click();
	}
}
