package pages.other_pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pages.BaseClass;

public class MoreAdvancedSearch extends BaseClass {
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public MoreAdvancedSearch(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	
	private static WebElement queryBox() {
		return driver.findElement(By.name("q"));
	}
	
	private static WebElement fieldsToReturn() {
		return driver.findElement(By.name("fl[]"));
	}
	
	private static WebElement sortOptionOne() {
		return driver.findElement(By.cssSelector("#rawform div:nth-child(5) select:nth-child(2)"));
	}
	
	private static WebElement sortOptionTwo() {
		return driver.findElement(By.cssSelector("#rawform div:nth-child(5) select:nth-child(4)"));
	}
	
	private static WebElement sortOptionThree() {
		return driver.findElement(By.cssSelector("#rawform div:nth-child(5) select:nth-child(6)"));
	}
	
	private static WebElement numberOfResults() {
		return driver.findElement(By.cssSelector("input#numresults"));
	}
	
	private static WebElement page() {
		return driver.findElement(By.name("page"));
	}
	
	private static List<WebElement> radioSelect() {
		return driver.findElements(By.name("output"));
	}
	
	private static WebElement checkXMLFormat() {
		return driver.findElement(By.name("save"));
	}
	
	private static WebElement showHideHelp() {
		return driver.findElement(By.xpath("//*[@id=\"rawform\"]/div[2]/table/tbody/tr[4]/td[1]/a"));
	}
	
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("form#rawform input.btn.btn-primary"));
	}
	
	//ACTIONS
	
	public void sendTextToQueryBox(String query_box) {
		queryBox().sendKeys(query_box);
	}
		
	public void fieldsToReturn(String fieldsTo_Return) {
		Select fieldsToReturn = new Select(fieldsToReturn());
		fieldsToReturn.selectByVisibleText(fieldsTo_Return);
	}

	public void sortOptionOne(String sortOption_One) {
		Select optionOne = new Select(sortOptionOne());
		optionOne.selectByVisibleText(sortOption_One);
	}
	
	public void sortOptionTwo(String sortOption_Two) {
		Select optionTwo = new Select(sortOptionTwo());
		optionTwo.selectByVisibleText(sortOption_Two);
	}
	
	public void sortOptionThree(String sortOption_Three) {
		Select optionThree = new Select(sortOptionThree());
		optionThree.selectByVisibleText(sortOption_Three);
	}
	
	public void sendTextToResults(String numberOfResults) {
		numberOfResults().sendKeys(numberOfResults);
	}
	
	public void sendTextToPage(String numberOfPages) {
		page().sendKeys(numberOfPages);
	}
	
	public List<WebElement> getRadioSelect() {
		return radioSelect();
	}
	
	public void clickRadioSelect(Integer radio_select) {
		getRadioSelect().get(radio_select).click();
	}
	
	public void clickXMLFormat() {
		checkXMLFormat().click();
	}
	
	public void clickHelp() {
		showHideHelp().click();
	}
	
	public void clickSearchButton() {
		searchButton().click();
	}

}
