package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.UploadPage;
import com.sdetfasttrack.utilities.Driver;
import com.sdetfasttrack.utilities.UploadFile;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.assertTrue;

public class UploadTests {
    //1. Go to http://practice.cybertekschool.com/upload
    //2.Find any file that is not too big in size. And get the path of the file.
    //3.Upload the file
    //4.Assert that file upload message is displayed

    UploadPage uploadPage= new UploadPage();
    @Test
    public void uploadTest(){
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        String path="C:\\Users\\käyttäjä\\Desktop\\SQL Schema.jpg";

        uploadPage.chooseFile.sendKeys(path);
        uploadPage.uploadButton.click();
        //UploadFile.fileAttachmentUsingRobot(path);
        assertTrue(uploadPage.uploadMessage.isDisplayed());
        assertTrue(uploadPage.uploadedFile.isDisplayed());


    }
    //Go to http://www.

    @Test
    public void testDownload(){

        Driver.getDriver().get("http://practice.cybertekschool.com/download");
        List<WebElement> allFiles= uploadPage.listOfDownload;
        List<String> text= uploadPage.listOfDownload.stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println("text = " + text);
        for (WebElement eachFile : allFiles) {
            eachFile.click();

        }

    }
}
