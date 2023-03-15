package com.juaracoding.cucumber;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import com.juaracoding.cucumber.utils.Constants;
import com.juaracoding.cucumber.utils.TestScenarios;
import com.juaracoding.cucumber.utils.utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.testng.internal.Utils;

import java.io.IOException;

public class Hooks {

    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ExtentReports reports = new ExtentReports("target/extent-report.html");
    @Before
    public static void setUp(){
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        TestScenarios[] test = TestScenarios.values();
        extentTest = reports.startTest(test[utils.testCount].getTestCaseName());
        utils.testCount++;
    }
    @After
    public void endTestCase(){
        reports.endTest(extentTest);
        reports.flush();
    }

    @AfterStep
    public void getResultStatus(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            String screenshotPath = utils.getScreenshot(driver,scenario.getName().replace(" ","_"));
            extentTest.log(LogStatus.FAIL,scenario.getName()+"\n"
            +extentTest.addScreenCapture(screenshotPath));
        }
    }

    @AfterAll
    public static void quitBrowser(){
        delay(3);
        DriverSingleton.closeObjectInstance();
    }

    static void delay(long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
