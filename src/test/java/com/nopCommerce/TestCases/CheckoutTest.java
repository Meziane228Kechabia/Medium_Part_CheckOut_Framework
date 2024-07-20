package com.nopCommerce.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopCommerce.Pages.AddToCartPage;
import com.nopCommerce.Pages.BooksHomePage;
import com.nopCommerce.Pages.CheckoutPage;
import com.nopCommerce.Pages.HomePage;
import com.nopCommerce.Pages.ProductSuccessPage;
import com.nopCommerce.TestBase.TestBase;

public class CheckoutTest extends TestBase {
	public WebDriver driver;
	public HomePage homePage;
	public BooksHomePage booksHomePage;
	public AddToCartPage addToCartPage;
	public CheckoutPage checkoutPage;
	public ProductSuccessPage productSuccesPage;
	
	  public CheckoutTest() throws Exception{ 
		  super();		  
	} 
	
		
@BeforeMethod
public void checkoutSetup() {
	driver = openingApplicationWithAnyBrowser(prop.getProperty("browser"));
    homePage = new HomePage(driver);
    homePage.clickOnBooksHomePageIcon();
    booksHomePage = new BooksHomePage(driver);
	}


@Test(priority=1)
public void verifyProductCheckout() {
    booksHomePage.clickOnPrideAndPrejudiceBook();
    addToCartPage = new AddToCartPage(driver);
    addToCartPage.clickOnPrideAndPrejudiceBookAddToCartButton();
    productSuccesPage = new ProductSuccessPage(driver);    
    productSuccesPage.validatingProductAddedMessage();
 }

@AfterMethod
public void tearDown() {	
	driver.quit();
	}
//This should work 2
}

