package pages.tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.IconMenu;
import pages.URLPages;
import pages.other_pages.LogInPage;

public class Test6 {
	
	public WebDriver d;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Iva\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		d = new FirefoxDriver();
	}
	
	
	@Test
	public void internetArchiveTest5() throws Exception{
		
		d.navigate().to(URLPages.HOME_PAGE);
		String MainWindow = d.getWindowHandle();
		new IconMenu(d).clickSignIn();
		
		WebElement form = d.findElement(By.cssSelector("span a"));
		Assert.assertTrue(form.isEnabled(), "There is not Forget Password link.");
		
		new LogInPage(d).clickSignUp();
		d.findElement(By.linkText("Terms of Service")).click();
		Thread.sleep(2000);

		Set<String> window = d.getWindowHandles();
	    Iterator<String> iterator = window.iterator();
	
	    while(iterator.hasNext()){
	    	String ChildWindow = iterator.next().toString();
	           // Takes the url from child window
	           if (!MainWindow.equalsIgnoreCase(ChildWindow)){
	               d.switchTo().window(ChildWindow);
	           }
	    }
	    
	    String URL = d.getCurrentUrl();
		Thread.sleep(3000);
		System.out.println(URL);
		Assert.assertTrue(URL.contains("terms"), "There isn't word tearm in current URL.");  
		
		Thread.sleep(2000);
		d.close();
		
	}
}
	

