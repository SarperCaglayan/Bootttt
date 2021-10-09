package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {

    public RadioButtonPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//label[@class='radio-inline'])[1]")
    public WebElement RadioButtunMale;

    @FindBy(xpath = "(//label[@class='radio-inline'])[2]")
    public WebElement RadioButtonFemale;

    @FindBy(xpath = "//button[@id='buttoncheck']")
    public WebElement ButtonCheck;

    @FindBy(xpath = "//p[@class='radiobutton']")
    public WebElement getValuAsText;
}
