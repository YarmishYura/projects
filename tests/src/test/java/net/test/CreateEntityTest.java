package net.test;

import com.test.base.BaseTest;
import com.test.pages.Pages;
import com.test.util.Random;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

public class CreateEntityTest extends BaseTest {
    private List<String> expectedOptions = Arrays.asList("", "Business Process", "Server", "Database", "Application", "Hardware");

    @Test(testName = "Check the possibility to create entity without filling in the required data")
    public void createEntityWithoutData() {
        Pages.loginPage().clickSubmitButton();
        Assert.assertEquals(Pages.loginPage().getHintMessage(), "Please review the form and correct the highlighted items.");
    }

    @Test(testName = "Check the possibility of choosing in the Entity Type dropdown  box")
    public void checkThePossibilityOfChoosingEntityType() {
        Pages.loginPage().clickEntityTypeField();
        Assert.assertEquals(Pages.loginPage().getListEntityType(), expectedOptions);
    }

    @Test(testName = "Check the possibility of choosing the Server item of the Entity Type dropdown box")
    public void checkServerItem() {
        Pages.loginPage().clickEntityTypeField();
        Pages.loginPage().clickEntityTypeServer();
        Pages.loginPage().typeTextEntityName("test");
        Pages.loginPage().clickSubmitButton();
        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "Check the possibility of choosing the Database item of the Entity Type dropdown box")
    public void checkDatabaseItem() {
        Pages.loginPage().clickEntityTypeField();
        Pages.loginPage().clickEntityTypeDatabase();
        Pages.loginPage().typeTextEntityName("test");
        Pages.loginPage().clickSubmitButton();
        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "Check the possibility of choosing the Application item of the Entity Type dropdown box")
    public void checkApplicationItem() {
        Pages.loginPage().clickEntityTypeField();
        Pages.loginPage().clickEntityTypeApplication();
        Pages.loginPage().typeTextEntityName("test");
        Pages.loginPage().clickSubmitButton();
        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "Check the possibility of choosing the Hardware item of the Entity Type dropdown box")
    public void checkHardwareItem() {
        Pages.loginPage().clickEntityTypeField();
        Pages.loginPage().clickEntityTypeHardware();
        Pages.loginPage().typeTextEntityName("test");
        Pages.loginPage().clickSubmitButton();
        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "Check the possibility of choosing the Business Process item of the Entity Type dropdown box")
    public void checkBusinessProcessItem() {
        Pages.loginPage().clickEntityTypeField();
        Pages.loginPage().clickEntityTypeBusinessProcess();
        Pages.loginPage().typeTextEntityName("test");
        Pages.loginPage().clickSubmitButton();
        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "Check if the Name field works correctly")
    public void nameFieldCorrectly() {
        Pages.loginPage().clickEntityNameFields();
        Pages.loginPage().typeTextEntityName("test");
        Pages.loginPage().selectRandomListElement();
        Pages.loginPage().clickSubmitButton();
        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "Check if a warning is displayed after you exceeded the maximum number of characters allowed in the Name field")
    public void invalidDataNameField(){
        Pages.loginPage().clickEntityNameFields();
        Pages.loginPage().typeTextEntityName(Random.genString(270));
        Pages.loginPage().clickSubmitButton();
        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "Check if a warning is displayed when you leave the Blackbox Name field empty after selecting  the Private check box")
    public void warningBlackBoxNameEmpty() {
        Pages.loginPage().clickPrivateButton();
        Pages.loginPage().typeTextEntityName("test");
        Pages.loginPage().selectRandomListElement();
        Pages.loginPage().clickSubmitButton();
        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "Check if the field Blackbox works correctly if the Private box is checked")
    public void privateIsChekedAndBlackBoxWorksCorrectly() {
        Pages.loginPage().clickPrivateButton();
        Pages.loginPage().typeTextBlackBoxName("test");
        Pages.loginPage().typeTextEntityName("test");
        Pages.loginPage().selectRandomListElement();
        Pages.loginPage().clickSubmitButton();
        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "Check if a warning is displayed if you exceed the maximum number of characters allowed in the Blackbox Name field")
    public void invalidBlackBoxNameField() {
        Pages.loginPage().clickPrivateButton();
        Pages.loginPage().typeTextBlackBoxName(Random.genString(270));
        Pages.loginPage().clickSubmitButton();
        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "Check the possibility to create entity if you fill valid data in all required fields")
    public void validDataInAllCreateEntity() {
        Pages.loginPage().selectRandomListElement();
        Pages.loginPage().typeTextBlackBoxName("test");
        Pages.loginPage().clickPrivateButton();
        Pages.loginPage().typeTextEntityName("test");
        Pages.loginPage().clickSubmitButton();
        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }
}


