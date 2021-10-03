package pageObject.Web;

import java.awt.geom.Arc2D.Double;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.BasePage;
import pageUI.Web.SearchPageUI;

public class SearchPageObject extends BasePage{
WebDriver driver;
public SearchPageObject(WebDriver driver)
{
	this.driver=driver;
}
public void clickToSearchButton() {
	// TODO Auto-generated method stub
	
}
public Boolean isValueIphone11Displayed() {
	// TODO Auto-generated method stub
	waitForElementVisible(driver, SearchPageUI.RESURT_SEARCH_AMAZON);
	return isElmentDisplayed(driver, SearchPageUI.RESURT_SEARCH_AMAZON);
	
}
public int getText() {
	// TODO Auto-generated method stub
     String te=	getElementText(driver, SearchPageUI.RESURT_SEARCH_AMAZON);
      System.out.println(te);
	waitForElementVisible(driver,SearchPageUI.RESURT_SEARCH_AMAZON);
	return countElementNumber(driver,SearchPageUI.RESURT_SEARCH_AMAZON);
}
public boolean isValueIphone11DisplayedBuy() {
	// TODO Auto-generated method stub
	waitForElementVisible(driver, SearchPageUI.PRICE_BESTBUY);
	return isElmentDisplayed(driver, SearchPageUI.PRICE_BESTBUY);
}
public boolean isProductamazonPriceSortAscending() {
	// TODO Auto-generated method stub
	List<WebElement> productPriceElement = getElements(driver,SearchPageUI.PRICE_AMAZON);
	List<Float> productNamePrice=new ArrayList<Float>();
	for(WebElement productPrice:productPriceElement)
	{
		productNamePrice.add(Float.parseFloat(productPrice.getText()));
	}
	System.out.println("List price amazon:-------");
	for (Float productPrice : productNamePrice) {
		System.out.println(productPrice);
	}
	List<Float> productNamePriceClone = new ArrayList<Float>(productNamePrice);
	Collections.sort(productNamePriceClone);
	System.out.println("After sort asc:---------------");
	for (Float productPrice : productNamePrice) {
		System.out.println(productPrice);
	}
	return productNamePrice.equals(productNamePrice);

}
public boolean isProductBestPriceSortAscending() {
	// TODO Auto-generated method stub
	List<WebElement> productPriceElement = getElements(driver, SearchPageUI.PRICE_BESTBUY);
	List<Float> productNamePrice = new ArrayList<Float>();
	for (WebElement productPrice : productPriceElement) {
		productNamePrice.add(Float.parseFloat(productPrice.getText().replace("$", "")));
	}
	System.out.println("Before sort asc:---------------");
	for (Float productPrice : productNamePrice) {
		System.out.println(productPrice);
	}
	// clone
	List<Float> productNamePriceClone = new ArrayList<Float>(productNamePrice);
	Collections.sort(productNamePriceClone);
	System.out.println("After sort asc:---------------");
	for (Float productPrice : productNamePrice) {
		System.out.println(productPrice);
		
	}
	return productNamePrice.equals(productNamePriceClone);
}

public void isProductBestPrice() {
	// TODO Auto-generated method stub
	List<WebElement> productPriceElement = getElements(driver, SearchPageUI.PRICE_BESTBUY);
	List<Float> productNamePrice2 = new ArrayList<Float>();
	for (WebElement productPrice : productPriceElement) {
		productNamePrice2.add(Float.parseFloat(productPrice.getText().replace("$", "")));
	}
	System.out.println("Before sort asc:---------------");
	for (Float productPrice : productNamePrice2) {
		System.out.println(productPrice);
	}
	
	
}

public void isSortWeb() {
	// TODO Auto-generated method stub

	List<Float> productNamePrice1 = new ArrayList<Float>();
	List<Float> productNamePrice2 = new ArrayList<Float>();
	 List list = new ArrayList(Arrays.asList(productNamePrice1));
	  list.addAll(Arrays.asList(productNamePrice2));
	  Object[] c = list.toArray();
	  System.out.println(Arrays.toString(c));
	 

}

}
