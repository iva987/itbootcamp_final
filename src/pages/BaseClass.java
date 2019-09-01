package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	protected static WebDriver driver;
	
	public BaseClass(WebDriver d) {
		driver = d;
	}
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public WebDriverWait waiter() {
		WebDriverWait wait = new WebDriverWait(getWebDriver(), 30, 500);
		return wait;
	}

	public void elementToAppear(By locator) {
		waiter().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void elementToAppear(WebElement element) {
		waiter().until(ExpectedConditions.visibilityOf(element));
	}
	
	public void elementToAppear(By locator, By locator2) {
		waiter().until(ExpectedConditions.and(
				ExpectedConditions.visibilityOfElementLocated(locator),
				ExpectedConditions.visibilityOfElementLocated(locator2)));
	}
	
	public void elementToAppear(WebElement element, WebElement element2) {
		waiter().until(ExpectedConditions.and(
				ExpectedConditions.visibilityOf(element),
				ExpectedConditions.visibilityOf(element2)));
	}
	
	public void elementToAppear(By locator, By locator2, By locator3) {
		waiter().until(ExpectedConditions.and(
				ExpectedConditions.visibilityOfElementLocated(locator),
				ExpectedConditions.visibilityOfElementLocated(locator2),
				ExpectedConditions.visibilityOfElementLocated(locator3)));
	}
	
	public void elementToBeClickable(By locator) {
		waiter().until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public void urlToContain(String url) {
		waiter().until(ExpectedConditions.urlContains(url));
	}
	
	public void elementToBeClickable(WebElement element) {
		waiter().until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void frameToBeAvailableAndSwitchToIt(By locator) {
		waiter().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}
	
	public void frameToBeAvailableAndSwitchToIt(WebElement frameLocator) {
		waiter().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	
	public void visibilityOf(WebElement element) {
		waiter().until(ExpectedConditions.visibilityOf(element));
	}
	
	public void visibilityOfAllElements(java.util.List<WebElement> elements) {
		waiter().until(ExpectedConditions.visibilityOfAllElements(elements));
	}
	
	public void visibilityOfAllElements(WebElement... elements) {
		waiter().until(ExpectedConditions.visibilityOfAllElements(elements));
	}
	
	public void visibilityOfAllElementsLocatedBy(By locator) {
		waiter().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public WebElement visibilityOfElementLocated(By locator) {
		return waiter().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void elementVisible(By locator) {
		waiter().until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
