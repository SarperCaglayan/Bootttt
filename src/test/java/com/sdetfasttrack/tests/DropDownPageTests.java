package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.DropDownPage;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.*;


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
        assertEquals(actual, expected, "Illinois is NOT selected");

        stateSelect.selectByValue("VA");
        expected = "Virginia";
        actual = stateSelect.getFirstSelectedOption().getText();
        assertEquals(actual, expected, "Virginia is NOT selected");

        stateSelect.selectByIndex(5);
        expected = "California";
        actual = stateSelect.getFirstSelectedOption().getText();
        assertEquals(actual, expected, "California is NOT selected");


    }
    //TC#2
    //Select “December 1st, 1921” and verify it is selected.
    //1. Go to http://practice.cybertekschool.com/dropdown
    //2. Select Year --> by visible text
    //3. Select Month -->  by value
    //4. Select Day -->  by index
    //5. Verify final selected option is California.
    @Test
    public void dropDownTest2(){
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
        Select yearSelector = new Select(dropDownPage.yearSelector);
        yearSelector.selectByVisibleText("1950");

        Select monthSelector = new Select(dropDownPage.monthSelector);
        monthSelector.selectByValue("11");

        Select daySelector = new Select(dropDownPage.daySelector);
        monthSelector.selectByIndex(0);

        String expectedYear= "1950";
        String actualYear= yearSelector.getFirstSelectedOption().getText();

        String expectedMonth= "January";
        String actualMonth= monthSelector.getFirstSelectedOption().getText();

        String expectedDay= "1";
        String actualDay= daySelector.getFirstSelectedOption().getText();

        assertEquals(actualYear, expectedYear, "Year is failed");
        assertEquals(actualMonth, expectedMonth,"Month is failed");
        assertEquals(actualDay, expectedDay, "Day is failed");
    }

    //TC#3
    //1.Go to http://practice.cybertekschool.com/dropdown
    //2. Select all the options from multiple select dropdown.
    //3. Print out all selected values and verify each is selected.
    //4.Deselect all values and verify each is deselected.

    @Test
    public void dropDownTest3(){
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
        Select select= new Select(dropDownPage.languages);

        List<WebElement> list= select.getAllSelectedOptions();

        for (WebElement eachElement : list) {
            String eachLanguage = eachElement.getText();

            select.selectByVisibleText(eachLanguage);
       assertTrue(eachElement.isSelected(), "Webelement was NOT selected");

        }
        select.deselectAll();
        List<WebElement> list2= select.getOptions();
        // List<String> stringList= select.getOptions().stream().map(WebElement::getText).collect(Collectors.toList());
        for (WebElement webElement : list2) {
            assertFalse(webElement.isSelected(), "Webelements are selected");
        }

        }

    }

