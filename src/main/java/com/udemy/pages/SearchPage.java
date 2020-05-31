package com.udemy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public SearchPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


        By searchResultinHeaderLocator = By.xpath("//h1[@class='udlite-heading-xxl']");
        By getSearchResultinHeaderSearchLocator = By.xpath("//input[@placeholder='Search for anything']");
        By getFirstSearchResultfromListLocator = By.xpath("(//div[@class='course-list--container--3zXPS'])/div[1]//div[contains(@class,'course-card--course-title')]");



        public void openSearchResultPage(){
            wait.until(ExpectedConditions.visibilityOfElementLocated(getFirstSearchResultfromListLocator));
            WebElement serchResultPage =driver.findElement(getFirstSearchResultfromListLocator);
        }

        public SearchPage getsearchResultinHeader (){
            WebElement searchResultinHeader =driver.findElement(searchResultinHeaderLocator);
            searchResultinHeader.getText();
            return this;

        }



}
