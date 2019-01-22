package com.test.pages;

import com.test.base.BasePage;
import com.test.locators.*;

import java.util.List;

public class LoginPage extends BasePage {
    private Locator submitButton = new ID("FSsubmit");
    private Locator hintMessage = new ClassName("invalid_message");
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

    public String getHintMessage() {
        return getElementText("getting hint", hintMessage);
    }

    public void clickEntityTypeField() {
        waitForElementToBeClickable(entityTypeField);
        click("Click 'EntityTypeField'", entityTypeField);
    }

    public List getListEntityType() {
        return getDropDownListItemsValueTexts("get list", entityTypeField);
    }

    public void clickEntityNameFields() {
        waitForElementToBeClickable(entityNameField);
        click("Click EntityNameField", entityNameField);
    }

    public void typeTextEntityName(String entityName) {
        waitForElementToBeClickable(entityNameField);
        type("write string", entityName, entityNameField);
    }

    public void selectRandomListElement() {
        waitForElementToBeClickable(entityTypeField);
        selectDropDownListRandomOption("select random element", entityTypeField);
    }

    public void clickPrivateButton() {
        waitForElementToBeClickable(privateOption);
        click("Click private button", privateOption);
    }

    public void typeTextBlackBoxName(String blackBoxName) {
        waitForElementToBeClickable(blackboxNameField);
        type("write string", blackBoxName, blackboxNameField);
    }

    public void clickEntityTypeServer() {
        waitForElementToBeClickable(entityTypeServer);
        click("click entity type element server", entityTypeServer);
    }

    public void clickEntityTypeDatabase() {
        waitForElementToBeClickable(entityTypeDatabase);
        click("click entity type element database", entityTypeDatabase);
    }

    public void clickEntityTypeApplication() {
        waitForElementToBeClickable(entityTypeApplication);
        click("click entity type element server", entityTypeApplication);
    }

    public void clickEntityTypeHardware() {
        waitForElementToBeClickable(entityTypeHardware);
        click("click entity type element hardware", entityTypeHardware);
    }

    public void clickEntityTypeBusinessProcess() {
        waitForElementToBeClickable(entityTypeBusinessProcess);
        click("click entity type element hardware", entityTypeBusinessProcess);
    }
}
