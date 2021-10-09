package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {

    public CheckBoxPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//input[@id='box1']")
    public WebElement checkbox1Button;

    @FindBy(xpath = "//input[@id='box2']")
    public WebElement checkbox2Button;

    @FindBy(xpath= "//input[@id='isAgeSelected']")
    public WebElement checkboxDemo;

    @FindBy(xpath="//div[@id='txtAge']")
    public WebElement getCheckboxIsChecked;


    //TC #2:checkboxes
    //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
    //3. Verify “Success – Check box is checked” message is NOT displayed.
    //4. Click to checkbox under “Single Checkbox Demo” section
    //5. Verify “Success – Check box is checked” message is displayed.
}
