package org.UITestingPlayground.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleAppPage {
    private WebDriver driver;
    private @FindBy(name="UserName")
    WebElement userName;
    private @FindBy(name="Password")
    WebElement passWord;
    private @FindBy(id="login")
    WebElement loginBtn;
    private @FindBy(id="loginstatus")
    WebElement loginSuccessMessage;


    public SampleAppPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setUserName(String userNameInput){
        userName.sendKeys(userNameInput);
    }

    public void setPassWord(String passWordInput){
        passWord.sendKeys(passWordInput);
    }

    public void login(){
        loginBtn.click();
    }

    public String getLoginSuccessMessage(){
        return loginSuccessMessage.getText();
    }
}
