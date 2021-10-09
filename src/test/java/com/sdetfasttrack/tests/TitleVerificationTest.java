package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.TitleVerification;
import com.sdetfasttrack.utilities.Driver;
import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


public class TitleVerificationTest {
//TC #1: Facebook Title Verification
    TitleVerification titleVerification = new TitleVerification();
    @Test
    public void testTitle() {
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        Driver.getDriver().get("https://www.facebook.com");

        //3. Verify title:
        // Expected: Facebook - Log In or Sign Up

        String expectedTitle = "Facebook – kirjaudu sisään tai rekisteröidy";
        String actualTitle = Driver.getDriver().getTitle();

        System.out.println("actualTitle = " + actualTitle);

        //Actual: we need to get from browser using selenium
        assertEquals(expectedTitle, actualTitle, "Title doesn't match");
    }


    @Test
    public void testGoogle() {
        //TC #2: Back and forth navigation
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Click to Gmail from top right.
        //4- Verify title contains:
        //Expected: Gmail
        //5- Go back to Google by using the .back();
        //6- Verify title equals:
        //Expected: Google
        Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().findElement(By.xpath("(//*[.='Hyväksyn'])[1]")).click();

        titleVerification.gmailLinkButton.click();
        String expectedTitle = "Gmail: Maksuton, yksityinen ja turvallinen sähköposti | Google Workspace";
        String actualTitle = Driver.getDriver().getTitle();

        assertEquals(expectedTitle, actualTitle, "Gmail title verification failed");
        assertTrue(expectedTitle.contains("Gmail"));

        //5- Go back to Google by using the .back();
        //6- Verify title equals:
        expectedTitle = "Google";
        Driver.getDriver().navigate().back();
        actualTitle = Driver.getDriver().getTitle();
        assertEquals(expectedTitle, actualTitle, "Google title verification failed");

    }

    @Test
    public void googleSearch(){
        //TC #3: Google search
        //1- Open a chrome browser

        Driver.getDriver().get("https://www.google.com");
        //2- Go to: https://google.com
        Driver.getDriver().findElement(By.xpath("(//*[.='Hyväksyn'])[1]")).click();// Click to Hyväksyn in order to pass cookies window
        //3- Write “apple” in search box
        //4- Click google search button
        titleVerification.searchApple();

        // (instead of clicking to search button we press ENTER)
        //5- Verify title:
        //Expected: Title should contain “apple” word

        String expectedTitle= "apple";
        String actualTitle= titleVerification.getTitle();
        assertTrue(actualTitle.contains(expectedTitle));



    }




};
