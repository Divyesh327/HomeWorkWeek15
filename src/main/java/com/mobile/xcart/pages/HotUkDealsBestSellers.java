package com.mobile.xcart.pages;

import com.mobile.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HotUkDealsBestSellers extends Utility
{

    By bestseller = By.linkText("Bestsellers");
    By hotukdeal = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By bestsellerpage = By.xpath("//h1[@id='page-title']");
    By shortbysale = By.xpath("//span[contains(text(),'Sales')]");
    By zToA = By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[5]");
    By highToLow = By.xpath("//ul[@class='display-sort sort-crit grid-list']/li[3]");
    By productArea = By.xpath("//ul[@class='products-grid grid-list']");

    public void ProductsArrangeByZToA() throws InterruptedException
    {
        mouseclickToElement(hotukdeal, 20);
        Thread.sleep(700);
        clickOnElement(bestseller, 20);
        verifyMessage(bestsellerpage, 5, "Bestsellers");
        mouseHoverToElement(shortbysale, 20);
        mouseclickToElement(zToA, 20);
        verifyDecendingorder(productArea);
        Reporter.log("user is on bestseller page " + bestseller + "<br>");
    }

    public void ProductsPriceArrangeHighToLow()
    {
        mouseclickToElement(hotukdeal, 20);
        mouseclickToElement(bestseller, 20);
        verifyMessage(bestsellerpage, 10, "Bestsellers");
        mouseHoverToElement(shortbysale, 10);
        mouseclickToElement(highToLow, 20);
        verifyDecendingorder(productArea);
        Reporter.log("user is on bestseller page " + bestseller + "<br>");
    }

}
