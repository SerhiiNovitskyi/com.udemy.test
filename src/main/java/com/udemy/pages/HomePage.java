package com.udemy.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;

public class HomePage {


    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver, WebDriverWait wait)  {
        this.driver = driver;
        this.wait = wait;
    }

    By registrationBtnLocator = By.xpath("//div[contains(@class,'header--gap-xs--1q0SU')]//span[contains(text(),'Sign up')]");
    By mycoursesBtnLocator = By.id("header.my-learning");
    By selectAccountlogoLocator = By.xpath("//div[contains(@class,'header')and contains(@class, 'list-menu')]");
    By dropDownAccountNameLocator = By.xpath("//div[contains(@class,'user-profile-dropdown')]//div[@class='udlite-heading-md']");
    By searchFieldlocator = By.xpath("//input[@placeholder='What do you want to learn?']");
//    By searchFieldlocator = By.xpath("//input[@id='search-field-home']");
//    By searchbuttonLocator = By.xpath("//span[@class,'input-group']//button[@type='submit']//following-sibling::input[@placeholder='What do you want to learn?']");
    By searchbuttonLocator = By.xpath("(//button[@type='submit'])[2]");
//    By searchFieldlocator = By.xpath("//input[@placeholder='Search for anything']");







    public void openHomePage () {
        driver.get("https://www.udemy.com/");

    }

    public void openRegistrationScreen(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(registrationBtnLocator)) ;
        WebElement registerPopUpBtm = driver.findElement(registrationBtnLocator);
        registerPopUpBtm.click();
    }


    public void loginUsingCoockies(){
        Cookie sessionId = new Cookie ("dj_session_id", "qvnuzu4jm7ljp126ftvdw8fgvbm7w68u");
        driver.manage().addCookie(sessionId);

    }


    public void selectAccountlogo(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectAccountlogoLocator));
        WebElement headerAccountIcon = driver.findElement(selectAccountlogoLocator);
        Actions action = new Actions(driver);
        action.moveToElement(headerAccountIcon).perform();


    }

    public String getAccountName()  {
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropDownAccountNameLocator));
        WebElement dropDownAccountName = driver.findElement(dropDownAccountNameLocator);
        return dropDownAccountName.getText();


    }

    public String getMycoursesButton () {

        wait.until(ExpectedConditions.visibilityOfElementLocated(mycoursesBtnLocator));

        WebElement mycoursesBtn = driver.findElement(mycoursesBtnLocator);
        return mycoursesBtn.getText();

    }

    public HomePage selectSearchField (String searchtext) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchFieldlocator));
        WebElement searchField = driver.findElement(searchFieldlocator);
        searchField.isSelected();
        searchField.sendKeys(searchtext);
        return this;
    }

    public HomePage clickSearchBtn (){
        WebElement searchbutton = driver.findElement(searchbuttonLocator);
        searchbutton.click();
        return this;
    }













}



