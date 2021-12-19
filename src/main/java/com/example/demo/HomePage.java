package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    private By products = By.className("inventory_item_name");

    private By title = By.className("title");

    private By logout = By.xpath("//*[@id=\"logout_sidebar_link\"]");

    private By buttonMenu = By.id("react-burger-menu-btn");
    
    private By menuDropDownFilter = By.cssSelector("select.product_sort_container");



    List<WebElement> listProducts = new ArrayList<>();

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public int contactProducts() {
        loadProductList();
        return listProducts.size();

    }

    public void loadProductList() {
        listProducts = driver.findElements(products);
    }

    public String showTitle() {

        return driver.findElement(title).getText();

    }

    public void clickButton() {
        driver.findElement(buttonMenu).click();
    }

    public void clickLinkLogout() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(logout).click();

    }

    public String getUrlLoginPage() {
        return driver.getCurrentUrl();

    }

    public void clickMenuDropDown(String option) {
        driver.findElement(menuDropDownFilter).sendKeys(option);

    }

}