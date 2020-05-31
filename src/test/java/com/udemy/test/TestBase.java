package com.udemy.test;

import com.udemy.pages.HomePage;
import com.udemy.pages.RegistrationPage;
import com.udemy.pages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.Random;

public class TestBase {

    WebDriver driver;
    WebDriverWait wait;
    HomePage homePage;
    RegistrationPage registrationPage;
    SearchPage searchPage;

    @BeforeMethod (description = "Open Brower")
    public void openBrowser() {
        File chromeDriver = new File("src/main/resources/chromedriver");
        ChromeDriverService chromeService = new ChromeDriverService.Builder()
                .usingDriverExecutable(chromeDriver)
                .usingAnyFreePort()
                .build();

        driver = new ChromeDriver(chromeService);
        wait = new WebDriverWait(driver, 15);
        homePage = new HomePage(driver, wait);
        registrationPage = new RegistrationPage(driver, wait);
        searchPage = new SearchPage(driver,wait);
    }


    @AfterMethod (description = "Close browser")
    public void closeBrowser() {
//        driver.quit();
    }
}
