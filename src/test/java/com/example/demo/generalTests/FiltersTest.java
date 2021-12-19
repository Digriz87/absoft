package com.example.demo.generalTests;

import com.example.demo.HomePage;
import com.example.demo.LoginPage;
import com.example.demo.ProductPage;
import com.example.demo.base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FiltersTest extends BaseTest {

    @Test
    @DisplayName("Should to check filters are working")
    public void testFilters() {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.loggingPut();
        ProductPage productPage = new ProductPage(driver);

        productPage.createSortingHighToLow();

        String expectedFirstProduct = "Sauce Labs Fleece Jacket";

        Assertions.assertEquals(expectedFirstProduct, productPage.getFirstProductAfterSorting().getText());


    }
}
