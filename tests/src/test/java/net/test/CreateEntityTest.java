package net.test;

import com.test.base.BaseTest;
import com.test.pages.LoginPage;
import com.test.pages.Pages;
import com.test.util.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

public class CreateEntityTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    List<String> expectedOptions = Arrays.asList("", "Business Process", "Server", "Database", "Application", "Hardware");

    @Test (testName = "Check the possibility to create entity without filling in the required data")
        public void test_1(){
            driver.get(Constants.BASE_URL);
            loginPage.clickSubmitButton();
            loginPage.wait(3);
            Assert.assertEquals(loginPage.getHintMessage(), "Please review the form and correct the highlighted items.");
        }

    @Test (testName = "Check the possibility of choosing in the Entity Type dropdown  box")
        public void test_2(){
            driver.get(Constants.BASE_URL);
            loginPage.clickEntityTypeField();
            loginPage.wait(2);
            Assert.assertEquals(loginPage.getListEntityType(), expectedOptions);
        }

    @Test (testName = "Check if the Name field works correctly")
        public void test_8(){
            driver.get(Constants.BASE_URL);
            loginPage.clickEntityNameFields();
            loginPage.wait(1);
            loginPage.typeTextEntityName();
            loginPage.wait(1);
            loginPage.selectRandomListElement();
            loginPage.wait(1);
            loginPage.clickSubmitButton();
            loginPage.wait(2);
        }

    @Test (testName = "Check if a warning is displayed when you leave the Blackbox Name field empty after selecting  the Private check box")
        public void test_10(){
            driver.get(Constants.BASE_URL);
            loginPage.clickPrivateButton();
            loginPage.wait(1);
            loginPage.typeTextEntityName();
            loginPage.wait(1);
            loginPage.selectRandomListElement();
            loginPage.wait(1);
            loginPage.clickSubmitButton();
            loginPage.wait(2);
        }

    @Test (testName = "Check the possibility to create entity if you fill valid data in all required fields")
        public void test_13(){
            driver.get(Constants.BASE_URL);
            loginPage.selectRandomListElement();
            loginPage.wait(1);
            loginPage.typeTextBlackBoxName();
            loginPage.wait(1);
            loginPage.clickPrivateButton();
            loginPage.wait(1);
            loginPage.typeTextEntityName();
            loginPage.wait(1);
            loginPage.clickSubmitButton();
            loginPage.wait(3);
        }

    @Test (testName = "Check the possibility of choosing the Server item of the Entity Type dropdown box")
        public void test_3(){
            driver.get(Constants.BASE_URL);
            loginPage.clickEntityTypeField();
            loginPage.wait(1);
            loginPage.clickEntityTypeServer();
            loginPage.wait(1);
            loginPage.typeTextEntityName();
            loginPage.wait(1);
            loginPage.clickSubmitButton();
            loginPage.wait(3);
    }

    @Test (testName = "Check the possibility of choosing the Database item of the Entity Type dropdown box")
        public void test_4(){
            driver.get(Constants.BASE_URL);
            loginPage.clickEntityTypeField();
            loginPage.wait(1);
            loginPage.clickEntityTypeDatabase();
            loginPage.wait(1);
            loginPage.typeTextEntityName();
            loginPage.wait(1);
            loginPage.clickSubmitButton();
            loginPage.wait(3);
        }

    @Test (testName = "Check the possibility of choosing the Application item of the Entity Type dropdown box")
        public void test_5(){
            driver.get(Constants.BASE_URL);
            loginPage.clickEntityTypeField();
            loginPage.wait(1);
            loginPage.clickEntityTypeApplication();
            loginPage.wait(1);
            loginPage.typeTextEntityName();
            loginPage.wait(1);
            loginPage.clickSubmitButton();
            loginPage.wait(3);
    }

    @Test (testName = "Check the possibility of choosing the Hardware item of the Entity Type dropdown box")
        public void test_6(){
            driver.get(Constants.BASE_URL);
            loginPage.clickEntityTypeField();
            loginPage.wait(1);
            loginPage.clickEntityTypeHardware();
            loginPage.wait(1);
            loginPage.typeTextEntityName();
            loginPage.wait(1);
            loginPage.clickSubmitButton();
            loginPage.wait(3);
    }

    @Test (testName = "Check the possibility of choosing the Business Process item of the Entity Type dropdown box")
        public void test_7(){
            driver.get(Constants.BASE_URL);
            loginPage.clickEntityTypeField();
            loginPage.wait(1);
            loginPage.clickEntityTypeBusinessProcess();
            loginPage.wait(1);
            loginPage.typeTextEntityName();
            loginPage.wait(1);
            loginPage.clickSubmitButton();
            loginPage.wait(3);
    }

    @Test (testName = "Check if the field Blackbox works correctly if the Private box is checked")
        public void test_11(){
            driver.get(Constants.BASE_URL);
            loginPage.clickPrivateButton();
            loginPage.wait(1);
            loginPage.typeTextBlackBoxName();
            loginPage.wait(1);
            loginPage.typeTextEntityName();
            loginPage.wait(1);
            loginPage.selectRandomListElement();
            loginPage.wait(1);
            loginPage.clickSubmitButton();
            loginPage.wait(2);
    }

    @Test (testName = "Check if a warning is displayed if you exceed the maximum number of characters allowed in the Blackbox Name field")
        public void test_12(){
            driver.get(Constants.BASE_URL);
    }
}

//        Pages.loginPage().setLogin("User");
//        Pages.loginPage().setPassword("Pass");
//
//        Pages.loginPage().clickSingInButton();
//
//        Assert.assertTrue(Pages.loginPage().isUserNameVisible(),
//                "User name is not visible");

