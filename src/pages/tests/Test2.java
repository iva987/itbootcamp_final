package pages.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HiddenMenu;
import pages.HomePage;
import pages.IconMenu;
import pages.URLPages;

public class Test2 {
	
	public static final Integer MENU_ICON = 1;
	public static final Integer FEATURED_TEXT = 0;
	public static final Integer ARCHIVE_ICONS = 1;
	
	public WebDriver d;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Iva\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		d = new FirefoxDriver();
	}
	
	@Test
	public void internetArchiveTest() throws Exception{
		
		d.navigate().to(URLPages.HOME_PAGE);
		new IconMenu(d).clickIcons(MENU_ICON); //click text icon
		new HiddenMenu(d).clickFeaturedTextList(FEATURED_TEXT); //click All Texts
		
		String url1 = d.getCurrentUrl(); 
		System.out.println(url1);
		
		new IconMenu(d).clickLogo(); // click logo
		new HomePage(d).clickIcons(ARCHIVE_ICONS); // click book icon
		Thread.sleep(2000);
		Assert.assertTrue(d.getCurrentUrl().equals(url1), "URLs are not the same");
		
		Thread.sleep(2000);
		d.close();
	}

}
