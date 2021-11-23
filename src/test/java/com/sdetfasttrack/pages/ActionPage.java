package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionPage {
    public ActionPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='figure'][1]")
    public WebElement hoverOne;

    @FindBy(xpath = "//div[@class='figure'][2]")
    public WebElement hoverTwo;

    @FindBy(xpath = "//div[@class='figure'][3]")
    public WebElement hoverThree;

    @FindBy(xpath = "//h5[.='name: user1']")
    public WebElement userOne;

    @FindBy(xpath = "//h5[.='name: user2']")
    public WebElement userTwo;

    @FindBy(xpath = "//h5[.='name: user3']")
    public WebElement userThree;

    @FindBy(xpath = "//div[@id='hot-spot']")
    public WebElement rightClick;

    @FindBy(id = "accept-choices")
    public WebElement alertAccept;

    @FindBy(id = "/p[@id='demo']")
    public WebElement doubleclick;
    //TC#2
    //1. Go	to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
    //2. Switch	to iframe.
    //3. Double	click on the text “Double-click	me to change my	text color.”
    // 4. Assert: Text’s “style” attribute value contains “red”




}
