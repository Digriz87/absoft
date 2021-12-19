package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    WebDriver driver;
    String productName;
    String productQuantity;
    WebElement checkoutButton;


    public String getProductName() {
        return driver.findElement(By.className("inventory_item_name")).getText();
    }

    public String getProductQuantity() {
        return driver.findElement(By.className("cart_quantity")).getText();
    }

    public WebElement getCheckoutButton() {
        return driver.findElement(By.className("checkout_button"));
    }


    public CartPage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void checkOut() {
        getCheckoutButton().click();
    }

}
