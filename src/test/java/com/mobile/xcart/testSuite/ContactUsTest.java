package com.mobile.xcart.testSuite;

import com.mobile.xcart.customListner.CustomeListner;
import com.mobile.xcart.pages.ContactUs;
import com.mobile.xcart.testBase.TestBase;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomeListner.class)
public class ContactUsTest extends TestBase
{
    ContactUs homepage = new ContactUs();
    @Test(groups = {"sanity","regression",},priority =3)
    public void contactUs(){
        homepage.userIscontactUsPage();

    }
}
