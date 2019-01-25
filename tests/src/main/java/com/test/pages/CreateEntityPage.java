package com.test.pages;

import com.test.base.BasePage;
import com.test.locators.*;

import java.util.List;

public class CreateEntityPage extends BasePage {
    private Locator submitButton = new ID("FSsubmit");
    private Locator errorMessage = new ClassName("invalid_message");
    private Locator entityTypeField = new ID("RESULT_RadioButton-1");
    private Locator entityNameField = new ID("RESULT_TextField-2");
    private Locator privateOption = new ID("RESULT_CheckBox-3_0");
    private Locator blackboxNameField = new ID("RESULT_TextField-4");
    private Locator entityTypeServer = new XPath("//*[@id=\"RESULT_RadioButton-1\"]/option[3]");
    private Locator entityTypeDatabase = new XPath("//*[@id=\"RESULT_RadioButton-1\"]/option[4]");
    private Locator entityTypeApplication = new XPath("//*[@id=\"RESULT_RadioButton-1\"]/option[5]");
    private Locator entityTypeHardware = new XPath("//*[@id=\"RESULT_RadioButton-1\"]/option[6]");
    private Locator entityTypeBusinessProcess = new XPath("//*[@id=\"RESULT_RadioButton-1\"]/option[2]");

    public void clickSubmitButton() {
        waitForElementToBeClickable(submitButton);
        click("Click 'Submit' button", submitButton);
    }

    public String getErrorMessage() {
        return getElementText("Get error message text", errorMessage);
    }

    public void clickEntityTypeField() {
        waitForElementToBeClickable(entityTypeField);
        click("Click 'Entity Type'", entityTypeField);
    }

    public List getListEntityType() {
        return getDropDownListItemsValueTexts("Get list of entity type", entityTypeField);
    }

    public void clickEntityNameFields() {
        waitForElementToBeClickable(entityNameField);
        click("Click EntityNameField", entityNameField);
    }

    public void typeTextEntityName(String entityName) {
        waitForElementToBeClickable(entityNameField);
        type("Set entity name:" + entityName, entityName, entityNameField);
    }

    public void selectRandomListElement() {
        waitForElementToBeClickable(entityTypeField);
        selectDropDownListRandomOption("Select random entity type", entityTypeField);
    }

    public void clickPrivateButton() {
        waitForElementToBeClickable(privateOption);
        click("Click private button", privateOption);
    }

    public void typeTextBlackBoxName(String blackBoxName) {
        waitForElementToBeClickable(blackboxNameField);
        type("Set blackbox name: " + blackBoxName, blackBoxName, blackboxNameField);
    }

    public void clickEntityTypeServer() {
        waitForElementToBeClickable(entityTypeServer);
        click("Click entity type element server", entityTypeServer);
    }

    public void clickEntityTypeDatabase() {
        waitForElementToBeClickable(entityTypeDatabase);
        click("Click entity type element database", entityTypeDatabase);
    }

    public void clickEntityTypeApplication() {
        waitForElementToBeClickable(entityTypeApplication);
        click("Click entity type element server", entityTypeApplication);
    }

    public void clickEntityTypeHardware() {
        waitForElementToBeClickable(entityTypeHardware);
        click("Click entity type element hardware", entityTypeHardware);
    }

    public void clickEntityTypeBusinessProcess() {
        waitForElementToBeClickable(entityTypeBusinessProcess);
        click("Click entity type element hardware", entityTypeBusinessProcess);
    }
}
