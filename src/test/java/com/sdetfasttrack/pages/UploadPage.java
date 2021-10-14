package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UploadPage {

    public UploadPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "file-upload")
    public WebElement chooseFile;

    @FindBy(id = "file-submit")
    public WebElement uploadButton;

    @FindBy(id = "file-submit")
    public WebElement submitButton;

    @FindBy(id = "uploaded-files")
    public WebElement uploadedFile;

    @FindBy(xpath = "//h3[.='File Uploaded!']")
    public WebElement uploadMessage;

    @FindBy(xpath = "//div[@class='example']/a")
    public List<WebElement> listOfDownload;



}
