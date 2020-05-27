package com.udemy.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;


public class LoginTest {

    @Test(description = "Login with valid credential")
    public void loginWithValidCredentials() throws InterruptedException {
        File chromeDriver = new File("src/main/resources/chromedriver");
        ChromeDriverService chromeService = new ChromeDriverService.Builder()
                .usingDriverExecutable(chromeDriver)
                .usingAnyFreePort()
                .build();


        WebDriver driver = new ChromeDriver(chromeService);

        driver.get("https://www.udemy.com/");

        pause(4000);

        WebElement loginPopUpBtm = driver.findElement(
                By.xpath("//button[@class='btn btn-quaternary']"));
        loginPopUpBtm.click();
        pause(3000);
        WebElement loginField = driver.findElement(By.id("email--1"));
        loginField.clear();
        loginField.sendKeys("sergi.novitskiy@gmail.com");

        WebElement passwrdField = driver.findElement(By.id("id_password"));
        passwrdField.clear();
        passwrdField.sendKeys("Ukraine79");

        pause(3000);
        WebElement loginBtn = driver.findElement(By.id("submit-id-submit"));
        loginBtn.click();


        pause(4000);

        WebElement profileIcon = driver.findElement(By.xpath("//a[@id='header.profile']//img"));

        Assert.assertEquals(profileIcon.getAttribute("Сергей Новицкий"),"Сергей Новицкий");











        driver.quit();


    }


        private void pause(int milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }



