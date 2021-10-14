package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.SynchronizationPage;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SyncronizationTests {

    SynchronizationPage synchronizationPage = new SynchronizationPage();

    @Test
    public void SyncTest1() {

        //TC#1
        //1. Go to http://practice.cybertekschool.com/dynamic_loading/1
        //2. Click to start
        //3. Wait until loading bar disappears
        //4. Assert username inputbox is displayed
        //5. Enter username: tomsmith
        //6. Enter password: incorrectpassword
        //7. Click to Submit button
        //8. Assert “Your password is invalid!” text is displayed.
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        synchronizationPage.startButton.click();
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), 10);
        webDriverWait.until(ExpectedConditions.visibilityOf(synchronizationPage.username));
        assertTrue(synchronizationPage.username.isDisplayed(), "Username was not displayed");

        synchronizationPage.username.sendKeys("tomsmith");
        synchronizationPage.password.sendKeys("incorrectpassword");

        synchronizationPage.submitButton.click();

        assertTrue(synchronizationPage.message.isDisplayed(), "The message was NOT displayed");


    }

    @Test
    public void SyncTest2() {

        //TC#2
        //1. Go to http://practice.cybertekschool.com/dynamic_loading/7
        //2. Wait until title is “Dynamic title”
        //3. Assert : Message “Done” is displayed.
        //4. Assert : Image is displayed.
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");

        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10);
//        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        wait.until(ExpectedConditions.visibilityOf(synchronizationPage.doneMessage));
        wait.until(ExpectedConditions.visibilityOf(synchronizationPage.image));
        assertTrue(synchronizationPage.doneMessage.isDisplayed(), "The 'Done!' message was NOT displayed");
        assertTrue(synchronizationPage.image.isDisplayed(), "The image was NOT displayed");
    }
}
