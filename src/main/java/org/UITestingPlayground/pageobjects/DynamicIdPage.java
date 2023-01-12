package org.UITestingPlayground.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicIdPage {
    private WebDriver driver;
    private @FindBy(xpath="//button[@class=\"btn btn-primary\"][@type=\"button\"]")
    WebElement btnWithDynamicId;

    public DynamicIdPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickDynamicBtn(){
        btnWithDynamicId.click();
    }
    public String getBtnIDAttribute(){
        return btnWithDynamicId.getAttribute("id");
    }
    public String getBtnIdText(){
        return btnWithDynamicId.getText();
    }
}
