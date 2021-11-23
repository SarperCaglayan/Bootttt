package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = "input[name='firstname']")
    public WebElement firstname;

    @FindBy(css = "input[name='lastname']")
    public WebElement lastname;

    @FindBy(css = "input[name='username']")
    public WebElement username;

    @FindBy(css = "input[name='email']")
    public WebElement email;

    @FindBy(css = "input[name='password']")
    public WebElement password;

    @FindBy(css = "input[name='phone']")
    public WebElement phone;

    @FindBy(xpath = "//label[contains(.,'Female')]")
    public WebElement female;

    @FindBy(css = "input[name='birthday']")
    public WebElement birthday;

    @FindBy(css = "select[name='department']")
    public WebElement department;

    @FindBy(css = "select[name='job_title']")
    public WebElement SDET;

    @FindBy(xpath = "//label[contains(@for,'inlineCheckbox2')]")
    public WebElement Java;

    @FindBy(id = "wooden_spoon")
    public WebElement signUp;

    @FindBy(xpath = "//h4[.='Well done!']")
    public WebElement messageDone;

}
