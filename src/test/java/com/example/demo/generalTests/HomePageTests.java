package com.example.demo.generalTests;

import com.example.demo.*;
import com.example.demo.base.BaseTest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTests extends BaseTest {

    @Test
    @DisplayName("Should counts of product on Home page")
    public void testCountsProducts() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.loggingPut();
        assertThat(homePage.contactProducts(), is(6));
    }

    @Test
    @DisplayName("Should show title of products")
    public void testShowTitleProducts() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.loggingPut();
        String products = homePage.showTitle().toLowerCase();
        Assertions.assertEquals("products", products);

    }

    @Test
    @DisplayName("Should to show Home page after logout")
    public void testLogout() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.loggingPut();
        homePage.clickButton();
        homePage.clickLinkLogout();
        String url = homePage.getUrlLoginPage();
        Assertions.assertEquals("https://www.saucedemo.com/",url);

    }
}

