package pageObject.Web;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.Web.HomePageUI;

public class HomePageObject extends BasePage{
WebDriver driver;
public HomePageObject(WebDriver driver)
{
	this.driver=driver;
}
public void enterToSearchTextbox(String value) {
	// TODO Auto-generated method stub
	waitForElementVisible(driver, HomePageUI.INPUT_KEY_AMAZON,value);
	sendkeyToElementByJS(driver,HomePageUI.INPUT_KEY_AMAZON,value);
	
}
public SearchPageObject clickToSearchButton() {
	// TODO Auto-generated method stub
	waitForElementClickable(driver, HomePageUI.SEARCH_BUTTON_AMAZON);
	clickToElement(driver,HomePageUI.SEARCH_BUTTON_AMAZON);
	return PageGeneratorManager.getSearchPageObject(driver);
}
public SearchPageObject clickToSearchBuyButton() {
	// TODO Auto-generated method stub
	waitForElementClickable(driver, HomePageUI.SEARCH_BUTTON_BUY);
	clickToElement(driver,HomePageUI.SEARCH_BUTTON_BUY);
	return PageGeneratorManager.getSearchPageObject(driver);
}
public void enterToSearchBuyTextbox(String value) {
	// TODO Auto-generated method stub
	waitForElementVisible(driver, HomePageUI.INPUT_KEY_BUY,value);
	senkeyToElement(driver,HomePageUI.INPUT_KEY_BUY,value);
}
}
