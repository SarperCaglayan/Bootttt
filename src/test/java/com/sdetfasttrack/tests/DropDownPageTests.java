package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.DropDownPage;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class DropDownPageTests {
    //TC#1
    //1. Go to http://practice.cybertekschool.com/dropdown
    //2. Select Illinois --> select by visible text
    //3. Select Virginia --> select by value
    //4. Select California --> select by index
    //5. Verify final selected option is California.
    DropDownPage dropDownPage = new DropDownPage();

    @Test
    public void dropDownTest1() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
        Select stateSelect = new Select(dropDownPage.stateSelector);

        stateSelect.selectByVisibleText("Illinois");
        String expected = "Illinois";
        String actual = stateSelect.getFirstSelectedOption().getText();
        assertEquals(expected,actual, "Illinois is NOT selected");

        stateSelect.selectByValue("VA");
        expected = "Virginia";
        actual = stateSelect.getFirstSelectedOption().getText();
        assertEquals(expected,actual, "Virginia is NOT selected");

        stateSelect.selectByIndex(5);
        expected = "California";
        actual = stateSelect.getFirstSelectedOption().getText();
        assertEquals(expected,actual, "California is NOT selected");


    }

}
