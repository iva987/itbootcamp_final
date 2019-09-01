package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage extends BaseClass {
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public ContactPage(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	
	private static List<WebElement> maps() {
		return driver.findElements(By.cssSelector("div.col-md-9 img"));
	}
	
	//ACTIONS
	
	public List<WebElement> getMaps() {
		return maps();
	}
	
	public void clickMaps(Integer maps) {
		maps().get(maps).click();
	}

}
