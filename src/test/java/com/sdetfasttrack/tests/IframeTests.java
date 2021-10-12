package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.IframePage;
import com.sdetfasttrack.utilities.Driver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class IframeTests {
    //1. Go to website: http://practice.cybertekschool.com/iframe
    //2. Locate as WebElement
    //3.Pass index number
    //4.Pass id or name attribute value (IF THERE ARE ANY)
    //5.Assert: "Your content goes here." Text is displayed.
    //6.switch back to default frame

    IframePage iframePage = new IframePage();

    @Test
    public void iframeTest1() {

        Driver.getDriver().get("http://practice.cybertekschool.com/iframe");
        //Driver.getDriver().switchTo().frame(iframePage.iframe);
        //Driver.getDriver().switchTo().frame(iframePage.iframeIndex);
        Driver.getDriver().switchTo().frame(iframePage.iframeId);
        assertTrue(iframePage.textDisplayed.isDisplayed(), "Text was NOT displayed");

    }
}
