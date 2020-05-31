package com.udemy.test;

import com.udemy.pages.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SearchTest extends TestBase {

    @Test(description = "Search by using 1 word")
    public void searchByUsingH1SearchField()  {

        homePage.openHomePage();
        homePage.selectSearchField("Angular");
        homePage.clickSearchBtn();
        searchPage.openSearchResultPage();
        searchPage.getsearchResultinHeader();
        Assert.assertTrue(searchPage.searchResultinHeader().getText().contains("Angular"));
        Assert.assertEquals(searchPage.getsearchResultinHeader(), "Sergi.Novitskiy");







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



