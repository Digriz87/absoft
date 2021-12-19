package com.example.demo.generalTests;

import com.example.demo.LoginPage;
import com.example.demo.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPageTests extends BaseTest {
    @Test
    @DisplayName("Should Login Successful")
    public void testLoginSuccess() {
        LoginPage loginPage = new LoginPage(driver);
        loadHomePage();
        loginPage.fillUser("standard_user");
        loginPage.fillPassword("secret_sauce");
        loginPage.clickButtonLogin();

    }

    @Test
    @DisplayName("Should show error if without logged in")
    public void testAccessInventoryPage() {
        LoginPage loginPage = new LoginPage(driver);
        loadHomePage();
        loginPage.loadPageInventory();

        String expected = "Epic sadface: You can only access '/inventory.html' when you are logged in.";

        String checked = loginPage.loadMessageErrorLoginWithoutLogin();

        assertEquals(expected, checked);

    }
}
