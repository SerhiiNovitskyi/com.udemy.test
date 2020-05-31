package com.udemy.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTest extends TestBase {

    @Test(description = "Login with valid credential")
    public void loginWithValidCredentials()  {

        homePage.openHomePage();
        homePage.loginUsingCoockies();
        homePage.openHomePage();
        homePage.getMycoursesButton();
        Assert.assertEquals(homePage.getMycoursesButton(), "My courses");





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



    }


    }



