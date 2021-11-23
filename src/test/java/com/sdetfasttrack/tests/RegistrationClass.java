package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.RegistrationPage;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationClass {

    RegistrationPage registrationPage= new RegistrationPage();

    @Test
    public void cssExercise(){

        Driver.getDriver().get("http://practice.cybertekschool.com/registration_form");
        registrationPage.firstname.sendKeys("Begum");
        registrationPage.lastname.sendKeys("Argun");
        registrationPage.email.sendKeys("begum@argun.com");
        registrationPage.password.sendKeys("12345678");
        registrationPage.username.sendKeys("begums");
        registrationPage.phone.sendKeys("123-456-7890");
        registrationPage.birthday.sendKeys("02/20/2003");
        registrationPage.female.click();
        Select select= new Select(registrationPage.department);
        select.selectByVisibleText("Department of Engineering");
        Select selectJob= new Select(registrationPage.SDET);
        selectJob.selectByVisibleText("SDET");
        registrationPage.Java.click();

        registrationPage.signUp.click();

        Assert.assertTrue(registrationPage.messageDone.isDisplayed());

    }
}
