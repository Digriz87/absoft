package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private static WebDriver driver;

    private By userField = By.id("user-name");
    private By passwordField = By.id("password");
    private By buttonLogin = By.id("login-button");
    private By messageLoginError = By.xpath("//form/div[3]/h3");

    public LoginPage(WebDriver driver) {
        LoginPage.driver = driver;
    }

    public void fillUser(String username) {

        driver.findElement(userField).sendKeys(username);
    }

    public void fillPassword(String password) {

        driver.findElement(passwordField).sendKeys(password);
    }

    public HomePage clickButtonLogin() {

        driver.findElement(buttonLogin).click();

        return new HomePage(driver);
    }

    public HomePage loggingPut() {
        fillUser("standard_user");
        fillPassword("secret_sauce");
        clickButtonLogin();

        return new HomePage(driver);
    }

    public void loadPageInventory() {
        driver.get("https://www.saucedemo.com/inventory.html");

    }

    public String loadMessageErrorLoginWithoutLogin() {

        return driver.findElement(messageLoginError).getText();

    }
}
