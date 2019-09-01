package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiddenMenu extends BaseClass {

	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public HiddenMenu(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	//Web
	private static WebElement webText() {
		return driver.findElement(By.cssSelector("div.wayback-txt"));
	}
	
	private static WebElement waybackMachineLogo() {
		return driver.findElement(By.cssSelector("div.col-sm-6 img"));
	}
	
	private static WebElement webSearch() {
		return driver.findElement(By.cssSelector("input#nav-wb-url"));
	}
	
	//Texts
	private static WebElement booksLogo() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.texts div.col-sm-2.col-xs-5.col-sm-pull-2 div.items_list_img a"));
	}
	
	private static WebElement booksToBorrow() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.texts div.col-sm-2.col-xs-5.col-sm-pull-2 a.stealth"));
	}
	
	private static WebElement openLibraryLogo() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.texts div.col-sm-2.col-xs-5.col-sm-pull-4 div.items_list_img a"));
	}
	
	private static WebElement openLibraryText() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.texts div.col-sm-2.col-xs-5.col-sm-pull-4 a.stealth"));
	}
	
	private static List<WebElement> featureTextList() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.texts div.col-sm-2.col-xs-7.col-sm-push-4 div.linx a"));
	}
	
	private static List<WebElement> topTextList() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.texts div.col-sm-2.col-xs-7.col-sm-push-2 div.linx a"));
	}
	
	private static List<WebElement> textList() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.texts div.linx.linx-topped a"));
	}
	
	//Videos
	private static WebElement tvNewsLogo() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-5.col-sm-pull-2 div.items_list_img a"));
	}
	
	private static WebElement tvNewsText() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-5.col-sm-pull-2 a.stealth.boxy-label"));
	}
	
	private static WebElement understandingLogo() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-5.col-sm-pull-4 div.items_list_img a"));
	}
	
	private static WebElement understandingText() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-5.col-sm-pull-4 a.stealth.boxy-label"));
	}
	
	private static List<WebElement> featureVideosList() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-7.col-sm-push-4 a"));
	}
	
	private static List<WebElement> topVideosList() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-7.col-sm-push-2 a"));
	}
	
	private static List<WebElement> videosList() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-7 div.linx.linx-topped a"));
	}
	//Audio
	private static WebElement liveMusicLogo() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-5.col-sm-pull-2 div.items_list_img a"));
	}
	
	private static WebElement liveMusicText() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-5.col-sm-pull-2 a.stealth.boxy-label"));
	}
	
	private static WebElement libriVoxLogo() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-5.col-sm-pull-4 div.items_list_img a"));
	}
	
	private static WebElement libriVoxText() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-5.col-sm-pull-4 a.stealth.boxy-label"));
	}
	
	private static List<WebElement> featureAudioList() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-7.col-sm-push-4 a"));
	}
	
	private static List<WebElement> topAudioList() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-7.col-sm-push-2 a"));
	}
	
	private static List<WebElement> audioList() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-7 div.linx.linx-topped a"));
	}
	//Software
	private static WebElement internetArcadeLogo() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-5.col-sm-pull-2 div.items_list_img a"));
	}
	
	private static WebElement internetArcadeText() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-5.col-sm-pull-2 a.stealth.boxy-label"));
	}
	
	private static WebElement consoleLogo() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-5.col-sm-pull-4 div.items_list_img a"));
	}
	
	private static WebElement consoleText() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-5.col-sm-pull-4 a.stealth.boxy-label"));
	}
	
	private static List<WebElement> featureSoftwareList() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-7.col-sm-push-4 a"));
	}
	
	private static List<WebElement> topSoftwareList() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-7.col-sm-push-2 a"));
	}
	
	private static List<WebElement> softwareList() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-7 div.linx.linx-topped a"));
	}
	//Image
	private static WebElement metropolitanLogo() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.image div.col-sm-2.col-xs-5.col-sm-pull-2 div.items_list_img a"));
	}
	
	private static WebElement metropolitanText() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.image div.col-sm-2.col-xs-5.col-sm-pull-2 a.stealth.boxy-label"));
	}
	
	private static WebElement brooklynLogo() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.image div.col-sm-2.col-xs-5.col-sm-pull-4 div.items_list_img a"));
	}
	
	private static WebElement brooklynText() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.image div.col-sm-2.col-xs-5.col-sm-pull-4 a.stealth.boxy-label"));
	}
	
	private static List<WebElement> featureImageList() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.image div.col-sm-2.col-xs-7.col-sm-push-4 a"));
	}
	
	private static List<WebElement> topImageList() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.image div.col-sm-2.col-xs-7.col-sm-push-2 a"));
	}
	
	
	//ACTIONS
	//Web
	public void clickWebText() {
		webText().click();
	}
	
	public void clickWaybackMachineLogo() {
		waybackMachineLogo().click();
	}
	
	public void sendTextToWebSearch(String search) {
		webSearch().sendKeys(search);
		webSearch().sendKeys(Keys.ENTER);
	}
	
	//Texts
	public void clickBooksLogo() {
		booksLogo().click();
	}
	
	public void clickBooksToBorrow() {
		booksToBorrow().click();
	}
	
	public void clickOpenLibraryLogo() {
		openLibraryLogo().click();
	}
	
	public void clickOpenLibraryText() {
		openLibraryText().click();
	}
	
	public List<WebElement> getFeaturedTextList() {
		return featureTextList();
	}
	
	public void clickFeaturedTextList(Integer featured_text) {
		getFeaturedTextList().get(featured_text).click();
	}
	
	public List<WebElement> getTopTextList() {
		return topTextList();
	}
	
	public void clickTopTextList(Integer top_text) {
		getTopTextList().get(top_text).click();
	}
	
	public List<WebElement> getTextList() {
		return textList();
	}
	
	public void clickTextList(Integer text_list) {
		getTextList().get(text_list).click();
	}
	//Videos
	public void clickTvNewsLogo() {
		tvNewsLogo().click();
	}
	
	public void clickTvNewsText() {
		tvNewsText().click();
	}
	
	public void clickUnderstandingLogo() {
		understandingLogo().click();
	}
	
	public void clickUnderstandingText() {
		understandingText().click();
	}
	
	public List<WebElement> getFeaturedVideosList() {
		return featureVideosList();
	}
	
	public void clickFeaturedVideosList(Integer featured_videos) {
		getFeaturedVideosList().get(featured_videos).click();
	}
	
	public List<WebElement> getTopVideosList() {
		return topVideosList();
	}
	
	public void clickTopVideosList(Integer top_videos) {
		getTopVideosList().get(top_videos).click();
	}
	
	public List<WebElement> getVideosList() {
		return videosList();
	}
	
	public void clickVideosList(Integer videos_list) {
		getVideosList().get(videos_list).click();
	}
	//Audio
	public void clickLiveMusicLogo() {
		liveMusicLogo().click();
	}
	
	public void clickLiveMusicText() {
		liveMusicText().click();
	}
	
	public void clickLibriVoxLogo() {
		libriVoxLogo().click();
	}
	
	public void clickLibriVoxText() {
		libriVoxText().click();
	}
	
	public List<WebElement> getFeaturedAudioList() {
		return featureAudioList();
	}
	
	public void clickFeaturedAudioList(Integer featured_audio) {
		getFeaturedAudioList().get(featured_audio).click();
	}
	
	public List<WebElement> getTopAudioList() {
		return topAudioList();
	}
	
	public void clickTopAudioList(Integer top_audio) {
		getTopAudioList().get(top_audio).click();
	}
	
	public List<WebElement> getAudioList() {
		return audioList();
	}
	
	public void clickAudioList(Integer audio_list) {
		getAudioList().get(audio_list).click();
	}
	
	//Software
	public void clickInternetArcadeLogo() {
		internetArcadeLogo().click();
	}
	
	public void clickInternetArcadeText() {
		internetArcadeText().click();
	}
	
	public void clickConsoleLogo() {
		consoleLogo().click();
	}
	
	public void clickConsoleText() {
		consoleText().click();
	}
	
	public List<WebElement> getFeaturedSoftwareList() {
		return featureSoftwareList();
	}
	
	public void clickFeaturedSoftwareList(Integer featured_software) {
		getFeaturedSoftwareList().get(featured_software).click();
	}
	
	public List<WebElement> getTopSoftwareList() {
		return topSoftwareList();
	}
	
	public void clickTopSoftwareList(Integer top_software) {
		getTopSoftwareList().get(top_software).click();
	}
	
	public List<WebElement> getSoftwareList() {
		return softwareList();
	}
	
	public void clickSoftwareList(Integer software_list) {
		getSoftwareList().get(software_list).click();
	}
	
	//Image
	public void clickMetropolitanLogo() {
		metropolitanLogo().click();
	}
	
	public void clickMetropolitanText() {
		metropolitanText().click();
	}
	
	public void clickBrooklynLogo() {
		brooklynLogo().click();
	}
	
	public void clickBrooklynText() {
		brooklynText().click();
	}
	
	public List<WebElement> getFeaturedImageList() {
		return featureImageList();
	}
	
	public void clickFeaturedImage(Integer featured_image) {
		getFeaturedImageList().get(featured_image).click();
	}
	
	public List<WebElement> getTopImageList() {
		return topImageList();
	}
	
	public void clickTopImage(Integer top_image) {
		getFeaturedImageList().get(top_image).click();
	}
	
	
	
	
}
