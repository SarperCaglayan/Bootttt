package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class AlertClass {
    public AlertClass(){
        PageFactory.initElements(Driver.getDriver(), this);


    }

}
