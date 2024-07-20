package com.nopCommerce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class HomePage {
		public WebDriver driver;
		
		@FindBy(linkText ="Books")
		private WebElement booksHomePageLink;
		

		public HomePage (WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
				
		public BooksHomePage clickOnBooksHomePageIcon() {
				booksHomePageLink.click();
				return new BooksHomePage(driver);
		}
		
}



