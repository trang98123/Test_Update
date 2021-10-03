package sotatek.hybird.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObject.Web.HomePageObject;
import pageObject.Web.PageGeneratorManager;
import pageObject.Web.SearchPageObject;

public class TC_03_Sort extends BaseTest {
	WebDriver driver;

	@Parameters({ "browser" })
	@BeforeClass
	public void beforeClass(String browserName) {
		log.info("Pre-Condition: Open browser" + browserName);
		driver = getBrowerDriver(browserName);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_01() {
		log.info("TC_01_Open_Browser_Tiki_SearchIPHONE11 - Step 01: Open browser");
		homePageObject = PageGeneratorManager.getHomePageObject(driver);
		driver.get("https://www.amazon.com/");
		log.info("TC_01_Open_Browser_Tiki_SearchIPHONE11 - Step 02: Input Value To Search Textbox");
		homePageObject.enterToSearchTextbox("iPhone 11");
		log.info("TC_01_Open_Browser_Tiki_SearchIPHONE11 - Step 03: Click To Search Button");
		searchPageObject = homePageObject.clickToSearchButton();
		searchPageObject.sleepInSecond(3);

		// TODO Auto-generated method stub
		List<WebElement> productPriceElement1 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<String> productNamePrice1 = new ArrayList<String>();
		for (WebElement productPrice : productPriceElement1) {
			productNamePrice1.add((productPrice.getText()));
		}
		System.out.println("List price amazon:-------");
		for (String productPrice : productNamePrice1) {
			System.out.println(productPrice);
		}

		driver.get("https://www.bestbuy.ca/en-ca/");
		log.info("TC_02_Open_Browser_BestBuy_SearchIPHONE11 - SStep 02: Input Value To Search Textbox");
		homePageObject.enterToSearchBuyTextbox("iPhone 11");
		log.info("TC_02_Open_Browser_BestBuy_SearchIPHONE11 - Step 03: Click To Search Button");
		searchPageObject = homePageObject.clickToSearchBuyButton();
		searchPageObject.sleepInSecond(7);
		List<WebElement> productPriceElement2 = driver
				.findElements(By.xpath("//div[@class='price_FHDfG medium_za6t1 ']"));
		List<String> productNamePrice2 = new ArrayList<String>();
		for (WebElement productPrice : productPriceElement2) {
			productNamePrice2.add(productPrice.getText().replace("$", ""));
		}
		System.out.println("List price amazon:-------");
		for (String productPrice : productNamePrice2) {
			System.out.println(productPrice);
		}
		List list = new ArrayList(Arrays.asList(productNamePrice1));
		list.addAll(Arrays.asList(productNamePrice2));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
		System.out.println(c);

	}

	HomePageObject homePageObject;
	SearchPageObject searchPageObject;

}
