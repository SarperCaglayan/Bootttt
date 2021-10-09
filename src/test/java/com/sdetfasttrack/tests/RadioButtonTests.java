package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.RadioButtonPage;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RadioButtonTests {

    //TC #1:radio buttons
    //1.GO TO: https://www.seleniumeasy.com/test/basic-radiobutton-demo.html
    //2. Confirm radio button #Male is NOT  enabled by default
    //3. Confirm radio button #Female is NOT enabled by default
    //4. Click radio button #Male to select it.
    //5. Click to button “Get Checked value”
    //7. Verify “Radio button 'Male' is checked” message is displayed.
    //8. Click radio button #Female to select it.
    //9. Click to button “Get Checked value”
    //10. Verify “Radio button 'Female' is checked” message is displayed.

    RadioButtonPage radioButtonPage = new RadioButtonPage();

    @Test
    public void test1() {
        Driver.getDriver().get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        assertTrue(!radioButtonPage.RadioButtunMale.isSelected());
        assertTrue(!radioButtonPage.RadioButtonFemale.isSelected());

        radioButtonPage.RadioButtunMale.click();
        radioButtonPage.ButtonCheck.click();

        assertTrue(radioButtonPage.getValuAsText.isDisplayed(), "“Radio button 'Male' is checked” message is NOT displayed.");


        radioButtonPage.RadioButtonFemale.click();
        radioButtonPage.ButtonCheck.click();

        assertTrue(radioButtonPage.getValuAsText.isDisplayed(), "“Radio button 'Female' is checked” message is NOT displayed.");

        String expectedResult= "Radio button 'Female' is checked";
        String actualResult= radioButtonPage.getValuAsText.getText();
        assertTrue(radioButtonPage.getValuAsText.isDisplayed(),"Message is N displayed");
        assertEquals(expectedResult, actualResult, "Messages did not match") ;
    }
}