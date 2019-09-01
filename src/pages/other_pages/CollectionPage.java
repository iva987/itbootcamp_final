package pages.other_pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import pages.BaseClass;

public class CollectionPage extends BaseClass {
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public CollectionPage(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	
	private static List<WebElement> sortButtons() {
		return driver.findElements(By.cssSelector("span.big-label.blue-pop a:not(.hidden)"));
	}
	
	private List<WebElement> searchResult() {
		return driver.findElements(By.cssSelector("div#ikind--downloads div:not(.mobile-header).item-ia.hov"));
	}
	
	private static WebElement videoCount() {
		return driver.findElement(By.cssSelector("div.results_coun"));
	}
	
	private static WebElement searchCollections() {
		return driver.findElement(By.name("and[]"));
	}
	
	private static List<WebElement> radioButtons() {
		return driver.findElements(By.cssSelector("div.search-options.js-search-options.is-open input"));
	}
	
	private static WebElement mediaTypeMore() {
		return driver.findElement(By.cssSelector("div.facet_mediatype a"));
	}

	private List<WebElement> mediaTypeList() {
		return driver.findElements(By.cssSelector("div.facet_mediatype input"));
	}
	
	private static WebElement yearMore() {
		return driver.findElement(By.cssSelector("div.facet_year a"));
	}
	
	private List<WebElement> yearList() {
		return driver.findElements(By.cssSelector("div.facet_year input"));
	}
	
	private static WebElement topicsSubjectMore() {
		return driver.findElement(By.cssSelector("div.facet_subject a"));
	}
	
	private List<WebElement> topicsSubjectList() {
		return driver.findElements(By.cssSelector("div.facet_subject a"));
	}
	
	private static WebElement collectionMore() {
		return driver.findElement(By.cssSelector("div.facet_collection span.sr-only"));
	}
	
	private List<WebElement> collectionList() {
		return driver.findElements(By.cssSelector("div.facet_collection input"));
	}
	
	private static WebElement creatorMore() {
		return driver.findElement(By.cssSelector("div.facet_creator a"));
	}
	
	private List<WebElement> creatorList() {
		return driver.findElements(By.cssSelector("div.facet_creator input"));
	}
	
	private static WebElement languageMore() {
		return driver.findElement(By.cssSelector("div.facet_languageSorter a"));
	}
	
	private List<WebElement> languageList() {
		return driver.findElements(By.cssSelector("div.facet_languageSorter input"));
	}
	
	private List<WebElement> icons() {
		return driver.findElements(By.cssSelector("div.col-xs-1.col-sm-2.welcome-right > a, div.col-xs-1.col-sm-2.welcome-right > span"));
	}
	
	
	//ACTIONS
	
	public List<WebElement> getSortButtons() {
		return sortButtons();
	}
	
	public void clickSortButton(Integer sort) {
		getSortButtons().get(sort).click();
	}
	
	public List<WebElement> getSearchResult() {
		return searchResult();
	}
	
	public void sizeSearchResult() {
		getSearchResult().size();
	}
	
	public void clickSearchResult(Integer collection_result) {
		getSearchResult().get(collection_result).click();
	}
	
	public void getTextVideoCount() {
		videoCount().getText();
	}
	
	public void sendTextToSearch(String search_collection) {
		searchCollections().sendKeys(search_collection);
	}
	
	public List<WebElement> getRadioButtons() {
		return radioButtons();
	}
	
	public void clickRadioButtons(Integer collection_radio) {
		getRadioButtons().get(collection_radio).click();
	}
	
	public void clickMediaMore() {
		mediaTypeMore().click();
	}

	public List<WebElement> getMediaList() {
		return mediaTypeList();
	}
	
	public void clickMediaList(Integer media_type) {
		getMediaList().get(media_type).click();
	}
	
	public void clickYearMore() {
		yearMore().click();
	}

	public List<WebElement> getYearList() {
		return yearList();
	}
	
	public void clickYearList(Integer year_list) {
		getYearList().get(year_list).click();
	}
	
	public void clickTopicsMore() {
		topicsSubjectMore().click();
	}

	public List<WebElement> getTopicsList() {
		return topicsSubjectList();
	}
	
	public void clickTopicsList(Integer topics_list) {
		getTopicsList().get(topics_list).click();
	}
	
	public void clickCollectionMore() {
		collectionMore().click();
	}

	public List<WebElement> getCollectionList() {
		return collectionList();
	}
	
	public void clickCollectionList(Integer collection_list) {
		getCollectionList().get(collection_list).click();
	}
	
	public void clickCreatornMore() {
		creatorMore().click();
	}

	public List<WebElement> getCreatorList() {
		return creatorList();
	}
	
	public void clickCreatorList(Integer creator_list) {
		getCreatorList().get(creator_list).click();
	}
	
	public void clickLanguageMore() {
		languageMore().click();
	}

	public List<WebElement> getLanguageList() {
		return languageList();
	}
	
	public void clickLanguageList(Integer language_list) {
		getLanguageList().get(language_list).click();
	}

	public List<WebElement> getIcons() {
		return icons();
	}
	
	public void clickIcons(Integer collection_icons) {
		getIcons().get(collection_icons).click();
	}


}
