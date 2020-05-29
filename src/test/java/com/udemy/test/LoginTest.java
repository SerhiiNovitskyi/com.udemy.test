package com.udemy.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;


public class LoginTest extends TestBase {

    @Test(description = "Login with valid credential")
    public void loginWithValidCredentials() throws InterruptedException {
        By loginPopUpBtnLocator = By.xpath("//button[@class='btn btn-quaternary']");
        By loginFieldLocator = By.id("email--1");
        By passwrdFieldLocator = By.id("id_password");
        By loginBtnLocator = By.id("submit-id-submit");
        By mycoursesBtnLocator = By.id("header.my-learning");
        By profileIconLocator = By.xpath("//div[contains(@class,'profile-dropdown')]//div[@class='udlite-heading-md']");

        driver.get("https://www.udemy.com/");

        Cookie sessionId = new Cookie ("dj_session_id", "xn3e4c1k09j1qm4umcjbmb0sa9fv55ig");
        driver.manage().addCookie(sessionId);

        driver.get("https://www.udemy.com/");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPopUpBtnLocator));
//
//        WebElement loginPopUpBtm = driver.findElement(loginPopUpBtnLocator);
//        loginPopUpBtm.click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(loginFieldLocator));
//
//        WebElement loginField = driver.findElement(loginFieldLocator);
//        loginField.clear();
//        loginField.sendKeys("sergi.novitskiy@gmail.com");
//
//
//        WebElement passwrdField = driver.findElement(passwrdFieldLocator);
//        passwrdField.clear();
//        passwrdField.sendKeys("Ukraine79");
//
//        wait.until(ExpectedConditions.elementToBeClickable(loginBtnLocator));
//        WebElement loginBtn = driver.findElement(loginBtnLocator);
//        loginBtn.click();

//        wait.until(ExpectedConditions.not(
//                ExpectedConditions.visibilityOfElementLocated(loginPopUpBtnLocator)));
//
////        WebElement mycoursesBtn = driver.findElement(mycoursesBtnLocator);
////        Assert.assertEquals(mycoursesBtn.getText(), "My courses");
//
//        WebElement profileIcon = driver.findElement(profileIconLocator);
//        Assert.assertEquals(profileIcon.getText(), "Сергей Новицкий");


        wait.until(ExpectedConditions.visibilityOfElementLocated(mycoursesBtnLocator));

        WebElement mycoursesBtn = driver.findElement(mycoursesBtnLocator);
        Assert.assertEquals(mycoursesBtn.getText(), "My courses");



    }


    }



