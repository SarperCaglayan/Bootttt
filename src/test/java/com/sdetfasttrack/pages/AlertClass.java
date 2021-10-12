package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertClass {
    public AlertClass() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[.='Click for JS Alert']")
    public WebElement clickJSAlert;

    @FindBy(xpath = "//button[.='Click for JS Confirm']")
    public WebElement clickJSConfirm;

    @FindBy(xpath = "//button[.='Click for JS Prompt']")
    public WebElement clickJSPrompt;

    @FindBy(id = "result")
    public WebElement textResult;
}
