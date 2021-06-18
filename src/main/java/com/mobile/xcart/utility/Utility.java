package com.mobile.xcart.utility;


import com.mobile.xcart.basePage.BasePage;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Utility extends BasePage
{

    public void clickOnElement(By by)
    {
        driver.findElement(by).click();

    }

    public void clickOnElement(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(by).click();

    }

    public String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    public String getTextFromElement(By by, int timeout)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by).getText();
    }

    public void sendTextFromElement(By by, String text)
    {

        driver.findElement(by).sendKeys(text);
    }

    public void sendTextFromElement(By by, int timeout, String text)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));

        driver.findElement(by).sendKeys(text);
    }

    public void selectByValueFromDropdown(By by, String value)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    public void selectByValueFromDropdown(By by, int timeout, String value)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    public void selectByVisableText(By by, int timeout, String value)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    public void mouseHoverToElement(By by)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }

    public void mouseHoverToElement(By by, int timeout)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }

    public void mouseclickToElement(By by, int timeout)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().build().perform();
    }

    public void verifyMessage(By by,int timeout,String expected)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        String expectedMessage = expected;
        String actualMessage = driver.findElement(by).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    public void verifyDecendingorder(By by)
    {
        List<WebElement> webelementslist = driver.findElements(by);
        List<String> weblistname = new ArrayList<>();
        for (WebElement list : webelementslist) {
            weblistname.add(list.getText());
        }
        List<String> templist = new ArrayList<>();
        templist.addAll(weblistname);
        Collections.sort(templist, Collections.reverseOrder());
        System.out.println(weblistname);
        System.out.println(templist);
        Assert.assertEquals(weblistname, templist);

    }

    public static String takeScreenShot(String fileName)
    {
        String filePath = System.getProperty("user.dir") + "/test-output/html/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        String imageName = fileName + currentTimeStamp() + ".jpg";
        String destination = filePath + imageName;
        try {
            FileUtils.copyFile(scr1, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

    public static String currentTimeStamp()
    {
        Date d = new Date();
        return d.toString().replace(":", "_").replace(" ", "_");
    }

    public static int generateRandomNumber()
    {
        return (int) (Math.random() * 5000 + 1);
    }

    public static String generatRandomString (int length)
    {
      return RandomStringUtils.random(length);
    }
}
