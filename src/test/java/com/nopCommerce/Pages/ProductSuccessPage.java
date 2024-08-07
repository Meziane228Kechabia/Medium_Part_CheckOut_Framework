
package com.nopCommerce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSuccessPage {
    private WebDriver driver;
    
    @FindBy(linkText = "Shopping cart")
    private WebElement productAddedMessage;
    
    public ProductSuccessPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public boolean validatingProductAddedMessage() {
        boolean displayStatus = productAddedMessage.isDisplayed();
        return displayStatus;
    }
}

