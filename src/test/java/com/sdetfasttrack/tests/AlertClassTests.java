package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.AlertClass;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertClassTests {

    AlertClass alertClass = new AlertClass();

    //1. Go to website: http://practice.cybertekschool.com/javascript_alerts
    @Test
    public void JSAlertTest1() {

        Driver.getDriver().get("http://practice.cybertekschool.com/javascript_alerts");
        //2.Clicking to the button for alert to be displayed
        alertClass.clickJSAlert.click();

        Alert alert1 = Driver.getDriver().switchTo().alert();
        alert1.accept();
        //4. Verify "You successfully clicked an alert" text is displayed.
        String expected = "You successfuly clicked an alert";
        String actual = alertClass.textResult.getText();

        assertEquals(expected, actual);

        //3. Click to OK button from the alert
        alertClass.clickJSConfirm.click();
        Alert alert2 = Driver.getDriver().switchTo().alert();
        alert2.accept();
        expected = "You clicked: Ok";
        actual = alertClass.textResult.getText();

        assertEquals(expected, actual);

        alertClass.clickJSPrompt.click();
        Alert alert3 = Driver.getDriver().switchTo().alert();
        alert3.sendKeys("hello");
        alert3.accept();
        expected = "You entered: hello";
        actual = alertClass.textResult.getText();

        assertEquals(expected, actual);
    }
}

