package com.udemy.test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;


public class RegistrationTest {


    @Test(description ="Registration ")
    public void registrationNewUser() throws InterruptedException {
        File chromeDriver = new File("src/main/resources/chromedriver");
        ChromeDriverService chromeService = new ChromeDriverService.Builder()
                .usingDriverExecutable(chromeDriver)
                .usingAnyFreePort()
                .build();


        WebDriver driver = new ChromeDriver(chromeService);

        driver.get("https://www.udemy.com/");

        pause(3000);

        WebElement registerPopUpBtm = driver.findElement(
                By.xpath("(//button[@class='btn btn-primary'])[1]"));
        registerPopUpBtm.click();
        pause(3000);

        WebElement registerName = driver.findElement(
                By.id("id_fullname"));
        registerName.clear();
        registerName.sendKeys("sergi.novitskiy");

        WebElement registerEmail = driver.findElement(
                By.id("email--1"));
        registerEmail.clear();
        registerEmail.sendKeys("sergi.novitskiy+7@gmail.com");

        WebElement registerPassword = driver.findElement(
                By.id("password"));
        registerPassword.clear();
        registerPassword.sendKeys("Ukraine79");

        WebElement checkboxBtn = driver.findElement(
                By.xpath("//span[@class='checkbox-label']"));

        checkboxBtn.click();

        WebElement registrationBtn = driver.findElement(
                By.id("submit-id-submit"));
        registrationBtn.click();

        pause(4000);

        WebElement dropDwnBtn = driver.findElement(
                By.xpath("//div[contains(@class,'user-dropdown-button hidden')]"));
        Select select = new Select(dropDwnBtn);

        WebElement profileIcon = driver.findElement(By.xpath("//span[@class='text-midnight ellipsis"));

        Assert.assertEquals(profileIcon.getText(),"Sergi.Novitskiy");

    }





    private void pause(int milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
