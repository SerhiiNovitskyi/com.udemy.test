package com.udemy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class RegistrationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    By registerNameFieldLocator = By.id("id_fullname");
    By registerEmailFieldLocator = By.id("email--1");
    By registerPasswrdFieldLocator = By.id("password");
    By registerCheckBoxBtnLocator = By.xpath("//span[@class='checkbox-label']");
    By registerSubmitBtnLocator = By.id("submit-id-submit");


    public RegistrationPage enterUserName(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerNameFieldLocator));
        WebElement registerName = driver.findElement(registerNameFieldLocator);
        registerName.clear();
        registerName.sendKeys(name);
        return this;
    }

    public RegistrationPage enterEmail(String email) {
        WebElement registerEmail = driver.findElement(registerEmailFieldLocator);
        registerEmail.clear();
        registerEmail.sendKeys(email);
        return this;
    }

    public RegistrationPage enterPassword(String password) {
        WebElement registerPassword = driver.findElement(registerPasswrdFieldLocator);
        registerPassword.clear();
        registerPassword.sendKeys(password);
        return this;
    }

    public RegistrationPage selectCheckRegistration() {
        WebElement checkboxBtn = driver.findElement(registerCheckBoxBtnLocator);
        checkboxBtn.click();
        return this;
    }

    public void registrationButton() {
        WebElement registrationBtn = driver.findElement(registerSubmitBtnLocator);
        wait.until(ExpectedConditions.elementToBeClickable(registerSubmitBtnLocator));
        registrationBtn.click();
    }


    public String randomString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String rndmStr = salt.toString();
        return rndmStr;

    }
}
