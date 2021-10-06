package com.sdetfasttrack.tests;

import com.sdetfasttrack.utilities.Driver;
import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testFacebookTitle {
//TC #1: Facebook Title Verification

    @Test
    public void testTitle(){
    //1. Open Chrome browser
    //2. Go to https://www.facebook.com
    Driver.getDriver().get("https://www.facebook.com");

    //3. Verify title:
    // Expected: Facebook - Log In or Sign Up

    String expectedTitle= "Facebook – kirjaudu sisään tai rekisteröidy";
    String actualTitle = Driver.getDriver().getTitle();

    System.out.println("actualTitle = " + actualTitle);

    //Actual: we need to get from browser using selenium
    Assert.assertEquals(expectedTitle, actualTitle, "Title doesn't match");


    //TC #2: Back and forth navigation
    //1- Open a chrome browser
    //2- Go to: https://google.com
    //3- Click to Gmail from top right.
    //4- Verify title contains:
    //Expected: Gmail
    //5- Go back to Google by using the .back();
    //6- Verify title equals:
    //Expected: Google
    //TC #3: Google search
    //1- Open a chrome browser
    //2- Go to: https://google.com
    //3- Write “apple” in search box
    //4- Click google search button
    // //(instead of clicking to search button we press ENTER)
    //5- Verify title:
    //Expected: Title should contain “apple” word




}}
