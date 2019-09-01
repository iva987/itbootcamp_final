package pages.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.IconMenu;
import pages.URLPages;
import pages.other_pages.AdvancedSearch;

public class Test7 {
	
	public static final String DATEYEAR_D = "2015";
	public static final String DATEMONTH_D = "09";
	public static final String DATEDAY_D = "09";
	
	public WebDriver d;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Iva\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		d = new FirefoxDriver();
	}
	
	
	@Test
	public void internetArchiveTest5() throws Exception{
		
		d.navigate().to(URLPages.ABOUT_PAGE);
		new IconMenu(d).clickSearchField();
		Assert.assertTrue(new IconMenu(d).getAdvancedSearch().isDisplayed(), "Advanced Search field is not displayed.");
		
		new IconMenu(d).clickAdvancedSearch();
		Thread.sleep(2000);
		String text1 = "advancedsearch";
		Assert.assertTrue(d.getCurrentUrl().contains(text1), "There isn't string 'advancedsearch' in current URL.");
		
		new AdvancedSearch(d).dateYearDropdown(DATEYEAR_D);
		new AdvancedSearch(d).dateMonthDropdown(DATEMONTH_D);
		new AdvancedSearch(d).dateDayDropdown(DATEDAY_D);
		new AdvancedSearch(d).clickSearchButton();
		Thread.sleep(2000);
		
		String text2 = "?query=date%3A2015-09-09";
		Assert.assertTrue(d.getCurrentUrl().contains(text2), "There is no string '?query=date%3A2015-09-09' in current URL.");
		
		String text3 = "date:2015-09-09";
		Assert.assertTrue(d.getPageSource().contains(text3), "There is no string 'date:2015-09-09' in search bar.");
		
		Thread.sleep(2000);
		d.close();
	}
}
