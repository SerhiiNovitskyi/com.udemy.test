package com.udemy.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class RegistrationTest extends TestBase {


    @Test(description = "Registration ")
    public void registrationNewUser() throws InterruptedException {
        By registrationBtnLocator = By.xpath("//button[contains(text(),'Sign Up')]");
        By registerNameFieldLocator = By.id("id_fullname");
        By registerEmailFieldLocator = By.id("email--1");
        By registerPasswrdFieldLocator = By.id("password");
        By registerCheckBoxBtnLocator = By.xpath("//span[@class='checkbox-label']");
        By registerSubmitBtnLocator = By.id("submit-id-submit");
        By mycoursesBtnLocator = By.id("header.my-learning");
//        By profileNameLocator = By.xpath("//span[@class='text-midnight ellipsis']");



        driver.get("https://www.udemy.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(registrationBtnLocator));

        WebElement registerPopUpBtm = driver.findElement(registrationBtnLocator);
        registerPopUpBtm.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(registerNameFieldLocator));
        WebElement registerName = driver.findElement(registerNameFieldLocator);
        registerName.clear();
        registerName.sendKeys("sergi.novitskiy");

        WebElement registerEmail = driver.findElement(registerEmailFieldLocator);
        registerEmail.clear();
        registerEmail.sendKeys(randomString()+"@gmail.com");

        WebElement registerPassword = driver.findElement(registerPasswrdFieldLocator);
        registerPassword.clear();
        registerPassword.sendKeys(randomString());

        WebElement checkboxBtn = driver.findElement(registerCheckBoxBtnLocator);
        checkboxBtn.click();

        WebElement registrationBtn = driver.findElement(registerSubmitBtnLocator);
        wait.until(ExpectedConditions.elementToBeClickable(registrationBtnLocator));
        registrationBtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(mycoursesBtnLocator));

        WebElement mycoursesBtn = driver.findElement(mycoursesBtnLocator);
        Assert.assertEquals(mycoursesBtn.getText(), "My courses");

//        WebElement profileName = driver.findElement(profileNameLocator);
//        Assert.assertEquals(profileName.getText(), "Sergi.Novitskiy");

    }

}