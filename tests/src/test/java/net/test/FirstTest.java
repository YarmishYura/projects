package net.test;

import com.test.base.BaseTest;
import com.test.pages.Pages;
import com.test.util.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test (testName = "Check the possibility to create entity without filling in the required data")
    public void openGooglePage(){
        driver.get(Constants.BASE_URL);

//        Pages.loginPage().setLogin("User");
//        Pages.loginPage().setPassword("Pass");
//
//        Pages.loginPage().clickSingInButton();
//
//        Assert.assertTrue(Pages.loginPage().isUserNameVisible(),
//                "User name is not visible");

    }



}
