package pages.other_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pages.BaseClass;

public class AdvancedSearch extends BaseClass {
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public AdvancedSearch(WebDriver d) {
		super(d);
	}
	
	//ELEMENTS
	
	private static List<WebElement> customFields() {
		return driver.findElements(By.cssSelector("div.col-sm-2 input.form-control.input-sm"));
	}
	
	private static WebElement anyFieldDropdown() {
		return driver.findElement(By.name("any_type"));
	}
	
	private static WebElement titleTypeDropdown() {
		return driver.findElement(By.name("title_type"));
	}
	
	private static WebElement creatorDropdown() {
		return driver.findElement(By.name("creator_type"));
	}
	
	private static WebElement descriptionDropdown() {
		return driver.findElement(By.name("description_type"));
	}
	
	private static WebElement collectionDropdown() {
		return driver.findElement(By.name("collection_type"));
	}
	
	private static WebElement mediatypeDropdown() {
		return driver.findElement(By.name("mediatype_type"));
	}
	
	private static WebElement customOneDropdown() {
		return driver.findElement(By.name("optional_field1_type"));
	}
	
	private static WebElement customTwoDropdown() {
		return driver.findElement(By.name("optional_field2_type"));
	}
	
	private static WebElement customThreeDropdown() {
		return driver.findElement(By.name("optional_field3_type"));
	}
	
	private static WebElement dateYearDropdown() {
		return driver.findElement(By.name("date_year"));
	}
	
	private static WebElement dateMonthDropdown() {
		return driver.findElement(By.name("date_month"));
	}
	
	private static WebElement dateDayDropdown() {
		return driver.findElement(By.name("date_day"));
	}
	
	private static WebElement dateFromYearDropdown() {
		return driver.findElement(By.name("date_from_year"));
	}
	
	private static WebElement dateFromMonthDropdown() {
		return driver.findElement(By.name("date_from_month"));
	}
	
	private static WebElement dateFromDayDropdown() {
		return driver.findElement(By.name("date_from_day"));
	}
	
	private static WebElement dateToYearDropdown() {
		return driver.findElement(By.name("date_to_year"));
	}
	
	private static WebElement dateToMonthDropdown() {
		return driver.findElement(By.name("date_to_month"));
	}
	
	private static WebElement dateToDayDropdown() {
		return driver.findElement(By.name("date_to_day"));
	}
	
	private static List<WebElement> inputFields() {
		return driver.findElements(By.cssSelector("div.col-sm-7 input.form-control.input-sm"));
	}
	
	private static WebElement allMediatypesDropdown() {
		return driver.findElement(By.name("mediatype_query"));
	}
	
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("center input.btn.btn-primary"));
	}
	
	//ACTIONS
	
	public  List<WebElement> getCustomFields() {
		return customFields();
	}
	
	public void sendTextToCustomFields(Integer custom_field, String text_custom) {
		getCustomFields().get(custom_field).sendKeys(text_custom);
	}
	
	public void anyFieldDropdown(String field_D) {
		Select anyField = new Select(anyFieldDropdown());
		anyField.selectByVisibleText(field_D);
	}
	
	public void titleTypeDropdown(String title_D) {
		Select titleType = new Select(titleTypeDropdown());
		titleType.selectByVisibleText(title_D);
	}
	
	public void creatorDropdown(String creator_D) {
		Select creatorD = new Select(creatorDropdown());
		creatorD.selectByVisibleText(creator_D);
	}
	
	public void descriptionDropdown(String description_D) {
		Select descriptionD = new Select(descriptionDropdown());
		descriptionD.selectByVisibleText(description_D);
	}
	
	public void collectionDropdown(String collection_D) {
		Select collectionD = new Select(collectionDropdown());
		collectionD.selectByVisibleText(collection_D);
	}
	
	public void mediatypeDropdown(String mediatype_D) {
		Select mediatypeD = new Select(mediatypeDropdown());
		mediatypeD.selectByVisibleText(mediatype_D);
	}
	
	public void customOneDropdown(String customOne_D) {
		Select customOneD = new Select(customOneDropdown());
		customOneD.selectByVisibleText(customOne_D);
	}
	
	public void customTwoDropdown(String customTwo_D) {
		Select customTwoD = new Select(customTwoDropdown());
		customTwoD.selectByVisibleText(customTwo_D);
	}
	
	public void customThreeDropdown(String customThree_D) {
		Select customThreeD = new Select(customThreeDropdown());
		customThreeD.selectByVisibleText(customThree_D);
	}
	
	public void dateYearDropdown(String dateYear_D) {
		Select dateYearD = new Select(dateYearDropdown());
		dateYearD.selectByVisibleText(dateYear_D);
	}
	
	public void dateMonthDropdown(String dateMonth_D) {
		Select dateMonthD = new Select(dateMonthDropdown());
		dateMonthD.selectByVisibleText(dateMonth_D);
	}
	
	public void dateDayDropdown(String dateDay_D) {
		Select dateDayD = new Select(dateDayDropdown());
		dateDayD.selectByVisibleText(dateDay_D);
	}
	
	public void dateFromYearDropdown(String dateFromYear_D) {
		Select dateFromYearD = new Select(dateFromYearDropdown());
		dateFromYearD.selectByVisibleText(dateFromYear_D);
	}
	
	public void dateFromMonthDropdown(String dateFromMonth_D) {
		Select dateFromMonthD = new Select(dateFromMonthDropdown());
		dateFromMonthD.selectByVisibleText(dateFromMonth_D);
	}
	
	public void dateFromDayDropdown(String dateFromDay_D) {
		Select dateFromDayD = new Select(dateFromDayDropdown());
		dateFromDayD.selectByVisibleText(dateFromDay_D);
	}
	
	public void dateToYearDropdown(String dateToYear_D) {
		Select dateToYearD = new Select(dateToYearDropdown());
		dateToYearD.selectByVisibleText(dateToYear_D);
	}
	
	public void dateToMonthDropdown(String dateToMonth_D) {
		Select dateToMonthD = new Select(dateToMonthDropdown());
		dateToMonthD.selectByVisibleText(dateToMonth_D);
	}
	
	public void dateToDayDropdown(String dateToDay_D) {
		Select dateToDayD = new Select(dateToDayDropdown());
		dateToDayD.selectByVisibleText(dateToDay_D);
	}
	
	public List<WebElement> getInputField() {
		return inputFields();
	}
	
	public void sendTextToInputFields(Integer input_field, String text_input) {
		getInputField().get(input_field).sendKeys(text_input);
	}
	
	public void allMediatypesDropdown(String mediatypes_D) {
		Select mediatypesD = new Select(allMediatypesDropdown());
		mediatypesD.selectByVisibleText(mediatypes_D);
	}
	
	public void clickSearchButton() {
		searchButton().click();
	}

}
