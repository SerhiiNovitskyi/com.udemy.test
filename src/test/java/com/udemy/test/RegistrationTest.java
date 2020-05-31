package com.udemy.test;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationTest extends TestBase {


    @Test(description = "Registration ")
    public void registrationNewUser()  {

        homePage.openHomePage();
        homePage.openRegistrationScreen();
        registrationPage
                .enterUserName("sergi.novitskiy")
                .enterEmail(registrationPage.randomString()+"@gmail.com")
                .enterPassword("Ukraine79")
                .selectCheckRegistration()
                .registrationButton();

        homePage.selectAccountlogo();
        homePage.getAccountName();
        Assert.assertEquals(homePage.getAccountName(), "Sergi.Novitskiy");


    }

}