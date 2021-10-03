package sotatek.hybird.web;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObject.Web.HomePageObject;
import pageObject.Web.PageGeneratorManager;
import pageObject.Web.SearchPageObject;

public class TC_01_Search extends BaseTest {
	WebDriver driver;

	@Parameters({ "browser" })
	@BeforeClass
	public void beforeClass(String browserName) {
		log.info("Pre-Condition: Open browser" + browserName);
		driver = getBrowerDriver(browserName);
		driver.manage().window().maximize();
	}

//	@Test
	public void TC_01_Open_Browser_Amazon_SearchIPHONE11() {
		log.info("TC_01_Open_Browser_Tiki_SearchIPHONE11 - Step 01: Open browser");
		homePageObject = PageGeneratorManager.getHomePageObject(driver);
		driver.get("https://www.amazon.com/");
		log.info("TC_01_Open_Browser_Tiki_SearchIPHONE11 - Step 02: Input Value To Search Textbox");
		homePageObject.enterToSearchTextbox("iPhone 11");
		log.info("TC_01_Open_Browser_Tiki_SearchIPHONE11 - Step 03: Click To Search Button");
		searchPageObject = homePageObject.clickToSearchButton();
		searchPageObject.sleepInSecond(10);
		log.info("TC_01_Open_Browser_Tiki_SearchIPHONE11 - Step 04: Sort ACD");
		verifyTrue(searchPageObject.isProductamazonPriceSortAscending());
		log.info("TC_01_Open_Browser_Tiki_SearchIPHONE11 - Step 05: Verify Value Displayed");
		verifyTrue(searchPageObject.isValueIphone11Displayed());
		
	}

	@Test
	public void TC_02_Open_Browser_BestBuy_SearchIPHONE11() {
		log.info("TC_02_Open_Browser_BestBuy_SearchIPHONE11 - Step 01: Open browser");
		homePageObject = PageGeneratorManager.getHomePageObject(driver);
		driver.get("https://www.bestbuy.ca/en-ca/");
		log.info("TC_02_Open_Browser_BestBuy_SearchIPHONE11 - SStep 02: Input Value To Search Textbox");
		homePageObject.enterToSearchBuyTextbox("iPhone 11");
		log.info("TC_02_Open_Browser_BestBuy_SearchIPHONE11 - Step 03: Click To Search Button");
		searchPageObject = homePageObject.clickToSearchBuyButton();
		searchPageObject.sleepInSecond(10);
		log.info("TC_02_Open_Browser_BestBuy_SearchIPHONE11 - Step 04: Sort ACDStep 04: Sort ACD");
		verifyTrue(searchPageObject.isProductBestPriceSortAscending());
		log.info("TC_02_Open_Browser_BestBuy_SearchIPHONE11 - Step 05: Verify Value Displayed");
		verifyTrue(searchPageObject.isValueIphone11DisplayedBuy());
		
	}

	HomePageObject homePageObject;
	SearchPageObject searchPageObject;
}
