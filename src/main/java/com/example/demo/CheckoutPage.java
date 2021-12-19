package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    WebDriver driver;

    WebElement finalizeOrderButton;


    public WebElement getFinalizeOrderButton() {
        return driver.findElement(By.className("cart_button"));
    }

    public String finishButtonText() {
        return getFinalizeOrderButton().getText();
    }


    public CheckoutPage(WebDriver driver) {
        super();
        this.driver = driver;
    }



    public void finalizePurchase() {
        getFinalizeOrderButton().click();
    }
}
