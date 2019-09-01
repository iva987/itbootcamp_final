package pages.tests;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.URLPages;

public class Test1 {
	
public static final Integer TOP_COLLECTION = 0;
	
	public WebDriver d;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Iva\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		d = new FirefoxDriver();
	}
	
	@Test
	public void internetArchiveTest() throws Exception{
		
		d.navigate().to(URLPages.HOME_PAGE);
		
		Assert.assertTrue(new HomePage(d).getTopCollections().size() > 19, "There are less than 20 elements in Top Collection");
		
		List<WebElement> collections = new HomePage(d).getTopCollections();
	    List<String> text = new ArrayList<String>();
	        
	    for (int i = 0; i < collections.size(); i++) {
	        WebElement items = collections.get(i).findElement(By.cssSelector("div.micro-label"));
	        text.add(items.getText());
	        Assert.assertTrue(text.contains("ITEMS"), "Collection does not contains word ITEMS.");
	    }
	    
	    WebElement number = collections.get(0).findElement(By.cssSelector("div:not(micro-label).num-items.topinblock"));
		String[] views1 = number.getText().split("[\\n]");
		System.out.println(views1[0]);
		
		new HomePage(d).clickTopCollestions(TOP_COLLECTION);
		WebElement results = d.findElement(By.cssSelector("div.results_count"));
		String[] views2 = results.getText().split("[\\s]");
		System.out.println(views2[0]);
		Assert.assertTrue(views2[0].equals(views1[0]), "Results are not the same.");
		
		Thread.sleep(2000);
		d.close();
		
	}
}