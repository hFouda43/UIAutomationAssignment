package org.UITestingPlayground.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsNG {
    public static ExtentReports getReportObject(){
        String path=System.getProperty("user.dir")+"\\reports\\report.html";
        ExtentSparkReporter reporter=new ExtentSparkReporter(path);
        reporter.config().setDocumentTitle("Test Results");
        reporter.config().setReportName("UI Playground Automation Test Results");
        ExtentReports extent=new ExtentReports();
        extent.attachReporter(reporter);
        return extent;
    }
}
