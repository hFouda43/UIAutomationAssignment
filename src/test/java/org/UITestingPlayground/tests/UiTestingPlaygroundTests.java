package org.UITestingPlayground.tests;

import org.UITestingPlayground.pageobjects.*;
import org.UITestingPlayground.testcomponents.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class UiTestingPlaygroundTests extends BaseTest {
//    WebDriver driver;
//    {
//        try {
//            driver = initializeDriver();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    HomePage homePage=new HomePage(driver);
//    DynamicTablePage dynamicTablePage=new DynamicTablePage(driver);
//    OverlappedElementPage overlappedElementPage=new OverlappedElementPage(driver);
//    SampleAppPage sampleAppPage=new SampleAppPage(driver);
//    DynamicIdPage dynamicIdPage=new DynamicIdPage(driver);


    @Test
    public void dynamicTablePageTest(){
        System.out.println("hello");
//        homePage.goTo();
//        waitForPageToLoad();
//        homePage.goToDynamicTablePage();
//        waitForPageToLoad();
//        double cpuCellValue=dynamicTablePage.getCpuLoadValue("Chrome");
//        double cpuLabelValue=dynamicTablePage.getCpuLabelValue();
//        Assert.assertEquals(cpuCellValue,cpuLabelValue);
    }
//
//    @Test
//    public void overlappedElementPageTest(){
//        homePage.goTo();
//        homePage.goToOverlappedElementPage();
//        overlappedElementPage.setNameFieldValue("Test");
//        String addedText=overlappedElementPage.getNameFieldValue();
//        Assert.assertEquals(addedText,"Test");
//    }
//
//    @Test
//    public void sampleAppPageTest(){
//        homePage.goTo();
//        homePage.goToSampleAppPage();
//        sampleAppPage.setUserName("Test");
//        sampleAppPage.setPassWord("pwd");
//        sampleAppPage.login();
//        Assert.assertTrue(sampleAppPage.getLoginSuccessMessage().contains("Welcome"));
//    }
//
//    @Test
//    public void dynamicIdPage(){
//        homePage.goTo();
//        homePage.goToDynamicIdPage();
//        String btnIDValueBeforeRefresh=dynamicIdPage.getBtnIDAttribute();
//        dynamicIdPage.clickDynamicBtn();
//        String btnIDTextAfterFirstClick=dynamicIdPage.getBtnIdText();
//        refreshWebPage();
//        String btnIDValueafterRefersh=dynamicIdPage.getBtnIDAttribute();
//        dynamicIdPage.clickDynamicBtn();
//        String btnIDTextAfterSecondClick=dynamicIdPage.getBtnIdText();
//        Assert.assertNotEquals(btnIDValueBeforeRefresh,btnIDValueafterRefersh);
//        Assert.assertEquals(btnIDTextAfterFirstClick,btnIDTextAfterSecondClick);
//    }
}
