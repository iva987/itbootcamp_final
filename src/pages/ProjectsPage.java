package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectsPage extends BaseClass {
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public ProjectsPage(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	
	private static List<WebElement> projectList() {
		return driver.findElements(By.cssSelector("div.col-sm-9"));
	}
	
	//ACTIONS
	
	public List<WebElement> getProjetList() {
		return projectList();
	}
	
	public void sizeProjectList() {
		projectList().size();
	}

}
