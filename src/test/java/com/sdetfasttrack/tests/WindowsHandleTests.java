package com.sdetfasttrack.tests;
import com.sdetfasttrack.pages.WindowHandlePage;
import com.sdetfasttrack.utilities.Driver;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.*;
public class WindowsHandleTests {
    WindowHandlePage windowsHandlePage = new WindowHandlePage();

    @Test
    public void windowHandleTest(){
        //1. Go to website: http://practice.cybertekschool.com/windows

        Driver.getDriver().get("http://practice.cybertekschool.com/windows");
         
        String expectedTitle="Practice";
        String actualTitle=Driver.getDriver().getTitle();
        assertEquals(actualTitle,expectedTitle,"Titles did not match");
       // windowsHandlePage.clickHereButton.click();
        //3. Click to: “Click Here” text
        String mainHandle=Driver.getDriver().getWindowHandle();
        Set<String> windHandles=Driver.getDriver().getWindowHandles();
        //4. Switch to new Window.
        for (String eachTab : windHandles) {
            Driver.getDriver().switchTo().window(eachTab);
            String title=Driver.getDriver().getTitle();
            if (title.contains("New Window")){
                break;
            }
        }
        //5. Assert: Title is “New Window”
        expectedTitle="New Window";
        actualTitle=Driver.getDriver().getTitle();
        assertEquals(actualTitle,expectedTitle,"Titles did not match");
        //6.Switch back to main handle
        Driver.getDriver().switchTo().window(mainHandle);


//3. Click to: “Click Here” text
//4. Switch to new Window.
//5. Assert: Title is “New Window”
//6.Switch back to main handle


}}