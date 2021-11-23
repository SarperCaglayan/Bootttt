package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.ActionPage;
import com.sdetfasttrack.pages.AlertClass;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ActionClassTests {
    //TC#1
    //1. Go to http://practice.cybertekschool.com/hovers
    //2. Hover over to first image
    //3. Assert: “name: user1” is displayed
    //4. Hover over to second image
    //5. Assert: “name: user2” is displayed
    //6. Hover over to third image
    //7. Assert: “name: user2” is displayed

    ActionPage actionPage = new ActionPage();

    @Test
    public void actionClassTest1() {
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(actionPage.hoverOne).build().perform();
        assertTrue(actionPage.userOne.isDisplayed(), "User1 is NOT displayed");

        actions.moveToElement(actionPage.hoverTwo).perform();
        assertTrue(actionPage.userTwo.isDisplayed(), "User2 is NOT displayed");

        actions.moveToElement(actionPage.hoverThree).perform();
        assertTrue(actionPage.userThree.isDisplayed(), "User3 is NOT displayed");

    }

    @Test
    public void actionClassTest2() {
        //TC#2
        //1. Go	to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        //2. Switch	to iframe.
        //3. Double	click on the text “Double-click	me to change my	text color.”
        // 4. Assert: Text’s “style” attribute value contains “red”

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        Driver.getDriver().findElement(By.xpath("//div[@id='accept-choices']")).click();

        Alert alert1= Driver.getDriver().switchTo().alert();

                alert1.dismiss();


        ActionPage actionPage= new ActionPage();
        Actions actions= new Actions(Driver.getDriver());

        actionPage.doubleclick.click();
        actionPage.doubleclick.click();




    }

    //TC#3
    //1. Go	to https://the-internet.herokuapp.com/context_menu
    //2. Right click to the	box.
    //3. Alert will open.
    //4. Accept	alert.

    @Test
    public void actionClassTest3() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(Driver.getDriver());

        actions.contextClick(actionPage.rightClick).perform();
        //actions.moveToElement(actionPage.rightClick).contextClick().perform();

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }
}
