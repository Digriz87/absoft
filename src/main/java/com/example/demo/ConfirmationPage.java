package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {

    WebDriver driver;

    String orderConfirmation;
    String assertText;

    public String orderConfirmationText() {
        return driver.findElement(By.className("complete-header")).getText();
    }

    public String getAssertText() {
        return "THANK YOU FOR YOUR ORDER";
    }

    public ConfirmationPage(WebDriver driver) {
        super();
        this.driver = driver;
    }

}
