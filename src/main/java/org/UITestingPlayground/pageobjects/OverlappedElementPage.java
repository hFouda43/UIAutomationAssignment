package org.UITestingPlayground.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverlappedElementPage {
    private WebDriver driver;

    public OverlappedElementPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    private @FindBy(css="div.container:nth-child(1)>div>div:nth-child(1)")
    WebElement scrollableDiv;

    private  @FindBy(id = "name")
    WebElement nameField;

    public void setNameFieldValue(String inputText){
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollTop=arguments[1].offsetTop",
                scrollableDiv,
                nameField);
        nameField.sendKeys(inputText);

    }

public String getNameFieldValue(){
        return nameField.getAttribute("value");
}
}
