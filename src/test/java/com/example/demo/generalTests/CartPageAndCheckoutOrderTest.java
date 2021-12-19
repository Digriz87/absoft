package com.example.demo.generalTests;

import com.example.demo.*;
import com.example.demo.base.BaseTest;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CartPageAndCheckoutOrderTest extends BaseTest {

    @Test
    @DisplayName("Should adding product from products page and close order after fill form about customer")
    public void productShouldBeAddedIntoCartFromProductsPage() {
        ProductPage productPage = new ProductPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CartPage cartPage = new CartPage(driver);
        HomePage homePage = loginPage.loggingPut();
        CustomerInfoPage customerInfoPage = new CustomerInfoPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        ConfirmationPage confirmationPage = new ConfirmationPage(driver);
        productPage.addFirstProductToCart();
        productPage.goToShoppingCart();
        Assert.assertEquals(cartPage.getProductName(), "Sauce Labs Backpack");
        Assert.assertEquals(cartPage.getProductQuantity(), "1");

        cartPage.checkOut();

        customerInfoPage.fillIn("Mladen", "Tomic", "21000");
        customerInfoPage.submit();

        Assert.assertEquals(checkoutPage.finishButtonText(), "FINISH");
        checkoutPage.finalizePurchase();

        Assert.assertEquals(confirmationPage.orderConfirmationText(), confirmationPage.getAssertText());
    }
}
