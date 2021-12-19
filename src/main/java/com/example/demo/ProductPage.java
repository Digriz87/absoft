package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

    WebDriver driver;
    WebElement productsHeaderText;
    WebElement firstProduct;
    WebElement shoppingCart;




    public WebElement getShoppingCart() {
        return driver.findElement(By.id("shopping_cart_container"));
    }

    public String getProductsHeaderText() {
        return driver.findElement(By.className("product_label")).getText();
    }

    public WebElement getFirstProduct() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }

    public WebElement getFirstProductAfterSorting() {
        return driver.findElement(By.linkText("Sauce Labs Fleece Jacket"));
    }

    public WebElement getFilters(){
        return driver.findElement(By.className("product_sort_container"));
    }

    public void createSortingHighToLow(){
        WebElement sortProducts = driver.findElement(By.className("product_sort_container"));
        sortProducts.click();
        Select sort = new Select(sortProducts);
        sort.selectByVisibleText("Price (high to low)");

    }

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addFirstProductToCart() {
        getFirstProduct().click();
    }

    public void goToShoppingCart() {
        getShoppingCart().click();
    }

}