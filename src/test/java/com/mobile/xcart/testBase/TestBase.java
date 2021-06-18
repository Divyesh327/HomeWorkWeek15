package com.mobile.xcart.testBase;


import com.mobile.xcart.propertyReader.PropertyReader;
import com.mobile.xcart.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");


    public void closeBrowser(){
        if (driver != null){
            driver.quit();
        }
    }
    @BeforeMethod(groups = {"smoke","sanity","regression"})
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod(groups = {"smoke","sanity","regression"})
    public void tearDown(){
        closeBrowser();
    }
}
