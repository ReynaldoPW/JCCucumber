package com.juaracoding.cucumber.utils;

import freemarker.template.SimpleDate;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class utils {
    public static int testCount = 0;
    public static String getScreenshot(WebDriver driver, String screenShotName) throws IOException {
        String dataName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir")+"/FailedTestScreenshot/"
                +screenShotName+"_"+dataName+".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source,finalDestination);
        return destination;
    }
}
