package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframePage {
    public IframePage(){

        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(xpath ="//*[@id='tinymce']")
    public WebElement iframe;

    String iframeId= "//*[@id='tinymce']";

    int iframeIndex=0;


    @FindBy(xpath = "//p[.='Your content goes there']")
    public WebElement textDisplayed;



}
