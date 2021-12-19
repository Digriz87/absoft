package com.example.demo.base;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class BaseTest {
    protected static WebDriver driver;


    @BeforeAll
    public static void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Algiz\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeEach
    public void loadHomePage() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

    }



    @AfterAll
    public static void finalizeDriver() {
        driver.quit();
    }
}
