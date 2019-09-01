package pages.other_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BaseClass;

public class UploadPage extends BaseClass {
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public UploadPage(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	
	private static WebElement uploadFilesButton() {
		return driver.findElement(By.cssSelector("a.buttonG"));
	}
	
	private static WebElement liveMusicUploadButton() {
		return driver.findElement(By.cssSelector("a.btn.btn-primary"));
	}
	
	private static WebElement questionMark() {
		return driver.findElement(By.cssSelector("span.iconochive-question-dark"));
	}
	
	//ACTIONS
	
	public void clickUploadFilesButton() {
		uploadFilesButton().click();
	}
	
	public void clickLiveMusicUploadButton() {
		liveMusicUploadButton().click();
	}
	
	public void clickQuestionMark() {
		questionMark().click();
	}

}
