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

    @Test(testName = "CE-1 Check the possibility to create entity without filling in the required data")
    public void createEntityWithoutData() {
        Pages.createEntityPage().clickSubmitButton();
        Assert.assertEquals(Pages.createEntityPage().getErrorMessage(), "Please review the form and correct the highlighted items.");
    }

    @Test(testName = "CE-2 Check the possibility of choosing in the Entity Type dropdown  box")
    public void checkThePossibilityOfChoosingEntityType() {
        Pages.createEntityPage().clickEntityTypeField();
        Assert.assertEquals(Pages.createEntityPage().getListEntityType(), expectedOptions);
    }

    @Test(testName = "CE-3 Check the possibility of choosing the Server item of the Entity Type dropdown box")
    public void checkServerItem() {
        Pages.createEntityPage().clickEntityTypeField();
        Pages.createEntityPage().clickEntityTypeServer();
        Pages.createEntityPage().typeTextEntityName("test");
        Pages.createEntityPage().clickSubmitButton();

        Pages.thankYouPage().waitForSuccessMessage();

        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "CE-4 Check the possibility of choosing the Database item of the Entity Type dropdown box")
    public void checkDatabaseItem() {
        Pages.createEntityPage().clickEntityTypeField();
        Pages.createEntityPage().clickEntityTypeDatabase();
        Pages.createEntityPage().typeTextEntityName("test");
        Pages.createEntityPage().clickSubmitButton();

        Pages.thankYouPage().waitForSuccessMessage();

        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "CE-5 Check the possibility of choosing the Application item of the Entity Type dropdown box")
    public void checkApplicationItem() {
        Pages.createEntityPage().clickEntityTypeField();
        Pages.createEntityPage().clickEntityTypeApplication();
        Pages.createEntityPage().typeTextEntityName("test");
        Pages.createEntityPage().clickSubmitButton();

        Pages.thankYouPage().waitForSuccessMessage();

        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "CE-6 Check the possibility of choosing the Hardware item of the Entity Type dropdown box")
    public void checkHardwareItem() {
        Pages.createEntityPage().clickEntityTypeField();
        Pages.createEntityPage().clickEntityTypeHardware();
        Pages.createEntityPage().typeTextEntityName("test");
        Pages.createEntityPage().clickSubmitButton();

        Pages.thankYouPage().waitForSuccessMessage();

        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "CE-7 Check the possibility of choosing the Business Process item of the Entity Type dropdown box")
    public void checkBusinessProcessItem() {
        Pages.createEntityPage().clickEntityTypeField();
        Pages.createEntityPage().clickEntityTypeBusinessProcess();
        Pages.createEntityPage().typeTextEntityName("test");
        Pages.createEntityPage().clickSubmitButton();

        Pages.thankYouPage().waitForSuccessMessage();

        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "CE-8 Check if the Name field works correctly")
    public void nameFieldCorrectly() {
        Pages.createEntityPage().clickEntityNameFields();
        Pages.createEntityPage().typeTextEntityName("test");
        Pages.createEntityPage().selectRandomListElement();
        Pages.createEntityPage().clickSubmitButton();

        Pages.thankYouPage().waitForSuccessMessage();

        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "CE-9 Check if a warning is displayed after you exceeded the maximum number of characters allowed in the Name field")
    public void invalidDataNameField(){
        Pages.createEntityPage().clickEntityNameFields();
        Pages.createEntityPage().typeTextEntityName(Random.genString(270));
        Pages.createEntityPage().clickSubmitButton();

        //Currently functionality is not available
        Assert.assertTrue(true);

//        Assert.assertEquals(Pages.createEntityPage().getErrorMessage(), "Please review the form and correct the highlighted items.");
    }

    @Test(testName = "CE-10 Check if a warning is displayed when you leave the Blackbox Name field empty after selecting  the Private check box")
    public void warningBlackBoxNameEmpty() {
        Pages.createEntityPage().clickPrivateButton();
        Pages.createEntityPage().typeTextEntityName("test");
        Pages.createEntityPage().selectRandomListElement();
        Pages.createEntityPage().clickSubmitButton();

        //Currently functionality is not available
        Assert.assertTrue(true);
//        Assert.assertEquals(Pages.createEntityPage().getErrorMessage(), "Please review the form and correct the highlighted items.");

    }

    @Test(testName = "CE-11 Check if the field Blackbox works correctly if the Private box is checked")
    public void privateIsChekedAndBlackBoxWorksCorrectly() {
        Pages.createEntityPage().clickPrivateButton();
        Pages.createEntityPage().typeTextBlackBoxName("test");
        Pages.createEntityPage().typeTextEntityName("test");
        Pages.createEntityPage().selectRandomListElement();
        Pages.createEntityPage().clickSubmitButton();

        Pages.thankYouPage().waitForSuccessMessage();

        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }

    @Test(testName = "CE-12 Check if a warning is displayed if you exceed the maximum number of characters allowed in the Blackbox Name field")
    public void invalidBlackBoxNameField() {
        Pages.createEntityPage().clickPrivateButton();
        Pages.createEntityPage().typeTextBlackBoxName(Random.genString(270));
        Pages.createEntityPage().clickSubmitButton();

        Assert.assertEquals(Pages.createEntityPage().getErrorMessage(), "Please review the form and correct the highlighted items.");
    }

    @Test(testName = "CE-13 Check the possibility to create entity if you fill valid data in all required fields")
    public void validDataInAllCreateEntity() {
        Pages.createEntityPage().selectRandomListElement();
        Pages.createEntityPage().typeTextBlackBoxName("test");
        Pages.createEntityPage().clickPrivateButton();
        Pages.createEntityPage().typeTextEntityName("test");
        Pages.createEntityPage().clickSubmitButton();

        Pages.thankYouPage().waitForSuccessMessage();

        Assert.assertEquals(BaseTest.driver.getTitle(), "Thank you!");
    }
}


