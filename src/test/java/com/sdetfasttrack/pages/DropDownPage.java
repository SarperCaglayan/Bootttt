package com.sdetfasttrack.pages;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DropDownPage {
    public DropDownPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id = "state")
    public WebElement stateSelector;

    @FindBy(xpath = "//select[@id='day']")
    public WebElement daySelector;

    @FindBy(xpath = "//select[@id='month']")
    public WebElement monthSelector;

    @FindBy(xpath = "//select[@id='year']")
    public WebElement yearSelector;

    @FindBy(xpath = "//select[@name='Languages']")
    public WebElement languages;


}


    //TC#2
    //Select “December 1st, 1921” and verify it is selected.
    //1. Go to http://practice.cybertekschool.com/dropdown
    //2. Select Year --> by visible text
    //3. Select Month -->  by value
    //4. Select Day -->  by index
    //5. Verify final selected option is California.




