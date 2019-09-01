package pages.other_pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BaseClass;

public class CollectionsAbout extends BaseClass {
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public CollectionsAbout(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	
	private static List<WebElement> contributors() {
		return driver.findElements(By.cssSelector("div.items_list.person"));
	}
	
	private static List<WebElement> grafs() {
		return driver.findElements(By.cssSelector("div.grafs"));
	}
	
	private static List<WebElement> topRegions() {
		return driver.findElements(By.cssSelector("table.stats-table tbody tr"));
	}
	
	private static List<WebElement> relatedCollections() {
		return driver.findElements(By.cssSelector("div.about-box div div:not(:nth-child(1)).topinblock"));
	}
	
	//ACTIONS
	
	public List<WebElement> getContributors() {
		return contributors();
	}
	
	public void sizeContributors() {
		getContributors().size();
	}
	
	public List<WebElement> getGrafs() {
		return grafs();
	}
	
	public List<WebElement> getTopRegions() {
		return topRegions();
	}
	
	public void sizeTopRegions() {
		getTopRegions().size();
	}
	
	public List<String> infoTopRegions() {
	       List<WebElement> table = getTopRegions();
	       List<String> region_country_views = new ArrayList<String>();
	        
	       for (int i = 0; i < table.size(); i++) {
	           WebElement region = table.get(i).findElement(By.cssSelector("td:nth-child(1)"));
	           WebElement country = table.get(i).findElement(By.cssSelector("td:nth-child(2)"));
	           WebElement views = table.get(i).findElement(By.cssSelector("td:nth-child(3)"));
	           region_country_views.add(region.getText() + ' ' + country.getText() + ' ' + views.getText());
	       }
	       return region_country_views;
	        
	}
	
	public List<WebElement> getRelatedCollections() {
		return relatedCollections();
	}
	

}
