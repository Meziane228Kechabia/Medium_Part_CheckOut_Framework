package com.nopCommerce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksHomePage {
	public WebDriver driver;

	
	@FindBy(xpath ="//*[@id=\"main\"]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a")
	private WebElement prideAndPrejudiceBook;
	
	public BooksHomePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	} 

	public BooksHomePage clickOnPrideAndPrejudiceBook() {
		prideAndPrejudiceBook.click();
		return new BooksHomePage(driver);
	}
	
}
