package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WindowHandlePage {
    public WindowHandlePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


}
