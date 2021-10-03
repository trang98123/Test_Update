package pageObject.Web;

import org.openqa.selenium.WebDriver;

import commons.BasePage;



public class PageGeneratorManager extends BasePage{
WebDriver driver;
private static HomePageObject homePageObject;
private static SearchPageObject searchPageObject;
private PageGeneratorManager()
{
	
}
public static HomePageObject getHomePageObject(WebDriver driver)
{
	if(homePageObject==null)
	{
		homePageObject= new HomePageObject(driver);
	}
	return homePageObject;
}
public static SearchPageObject getSearchPageObject(WebDriver driver)
{
	if(searchPageObject==null)
	{
		searchPageObject= new SearchPageObject(driver);
	}
	return searchPageObject;
}
}
