package com.nopCommerce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	public WebDriver driver;
	
	@FindBy(xpath = "//button[@id='add-to-cart-button-39']")
	private WebElement prideAndPrejudiceBookAddToCartButton;
	
	public AddToCartPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public AddToCartPage clickOnPrideAndPrejudiceBookAddToCartButton() {
	prideAndPrejudiceBookAddToCartButton.click();
    return new AddToCartPage(driver);
	}
}
