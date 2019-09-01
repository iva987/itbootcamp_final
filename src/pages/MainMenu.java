package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainMenu extends BaseClass {

	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public MainMenu(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
    
    private static WebElement aboutPage() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(1) a"));
    }
    private static WebElement contactPage() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(2) a"));
    }
    private static WebElement blogPage() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(3) a"));
    }
    private static WebElement projectsPage() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(4) a"));
    }
    private static WebElement helpPage() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(5) a"));
    }
    private static WebElement donatePage() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(6) a"));
    }
    private static WebElement jobsPage() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(7) a"));
    }
    private static WebElement volunteerPage() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(8) a"));
    }
    private static WebElement peoplePage() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(9) a"));
    }
    
    // Actions
    
    public void clickAboutPage() {
        aboutPage().click();
    }
    public void clickContactPage() {
        contactPage().click();
    }
    public void clickBlogPage() {
        blogPage().click();
    }
    public void clickProjectsPage() {
        projectsPage().click();
    }
    public void clickHelpPage() {
        helpPage().click();
    }
    public void clickDonatePage() {
        donatePage().click();
    }
    public void clickJobsPage() {
        jobsPage().click();
    }
    public void clickVolunteerPage() {
        volunteerPage().click();
    }
    public void clickPeoplePage() {
        peoplePage().click();
    }
}
