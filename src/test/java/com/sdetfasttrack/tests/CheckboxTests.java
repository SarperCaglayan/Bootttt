package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.CheckBoxPage;
import com.sdetfasttrack.utilities.Driver;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CheckboxTests {

    CheckBoxPage checkboxPage = new CheckBoxPage();

    @Test
    public void checkboxTest() {
        //TC #1:checkboxes
        //1. Go to http://practice.cybertekschool.com/checkboxes

        Driver.getDriver().get("http://practice.cybertekschool.com/checkboxes");
        //2. Confirm checkbox #1 is NOT selected by default

        assertTrue(!checkboxPage.checkbox1Button.isSelected(), "Check box1 is selected");
        assertFalse(checkboxPage.checkbox1Button.isSelected(), "Check box1 is selected");

        //3. Confirm checkbox #2 is SELECTED by default.

        assertTrue(checkboxPage.checkbox2Button.isSelected(), "Check box1 is NOT selected");
        //4. Click checkbox #1 to select it.
        checkboxPage.checkbox1Button.click();
        //5. Click checkbox #2 to deselect it.
        checkboxPage.checkbox2Button.click();
        //6. Confirm checkbox #1 is SELECTED.
        assertTrue(checkboxPage.checkbox1Button.isSelected(),"Check box1 is NOT selected");

        //7. Confirm checkbox #2 is NOT selected.
        assertTrue(!checkboxPage.checkbox2Button.isSelected(),"Check box1 is selected");

    }
        @Test
        public void checkboxDemo(){

            //TC #2:checkboxes
            //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
            //3. Verify “Success – Check box is checked” message is NOT displayed.
            //4. Click to checkbox under “Single Checkbox Demo” section
            //5. Verify “Success – Check box is checked” message is displayed.


        Driver.getDriver().get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        assertFalse(checkboxPage.checkboxDemo.isSelected(), "“Success – Check box is Selected");
        assertTrue(!checkboxPage.getCheckboxIsChecked.isDisplayed(), "“Success – Check box is checked” message is displayed");

        checkboxPage.checkboxDemo.click();
        assertTrue(checkboxPage.getCheckboxIsChecked.isDisplayed(),"“Success – Check box is checked” message is NOT displayed");



    }

}
