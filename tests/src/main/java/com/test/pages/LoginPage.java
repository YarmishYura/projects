package com.test.pages;


import com.test.base.BasePage;
import com.test.base.BaseTest;
import com.test.locators.*;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginPage extends BasePage {
/*
    Locator userField = new ID("user_name");
    Locator passwordField = new ID("password");

    Locator singInButton = new XPath("//input[@type='button']");


    public void setLogin(String login){
        waitForElementVisibility(userField);
        type("Set '" + login + "'", login, userField);
    }

    public void setPassword(String password){
        waitForElementVisibility(passwordField);
        type("Set '" + password + "'", password, passwordField);
    }

    public void clickSingInButton(){
        waitForElementToBeClickable(singInButton);
        click("Click 'Sing In' button", singInButton);
    }


    Locator userName = new XPath("//span[@name='current_user_name']");

    public boolean isUserNameVisible(){
        return isElementVisible(userName);
    }
*/
    Locator submitButton = new ID("FSsubmit");
    Locator hintMessage = new ClassName("invalid_message");
    Locator entityTypeField = new ID("RESULT_RadioButton-1");
    Locator entityNameField = new ID("RESULT_TextField-2");
    Locator privateOption = new ID("RESULT_CheckBox-3_0");
    Locator blackboxNameField = new ID("RESULT_TextField-4");
    Locator entityTypeServer = new XPath("//*[@id=\"RESULT_RadioButton-1\"]/option[3]");
    Locator entityTypeDatabase = new XPath("//*[@id=\"RESULT_RadioButton-1\"]/option[4]");
    Locator entityTypeApplication = new XPath("//*[@id=\"RESULT_RadioButton-1\"]/option[5]");
    Locator entityTypeHardware = new XPath("//*[@id=\"RESULT_RadioButton-1\"]/option[6]");
    Locator entityTypeBusinessProcess = new XPath("//*[@id=\"RESULT_RadioButton-1\"]/option[2]");
//    Locator reportButton = new ID("//*[@id=\"FSForm\"]/div[2]/div[10]/a[2]");
//    Locator formsiteButton = new ID("//*[@id=\"FSForm\"]/div[2]/div[10]/a[1]");
//


    public void clickSubmitButton(){
        waitForElementToBeClickable(submitButton);
        click("Click 'Submit' button", submitButton);
    }

    public String getHintMessage() {
        return getElementText("getting hint", hintMessage);
    }

    public void clickEntityTypeField(){
        waitForElementToBeClickable(entityTypeField);
        click("Click 'EntityTypeField'", entityTypeField);
    }

    public List getListEntityType(List list){
        return list = getDropDownListItemsValueTexts("get list", entityTypeField);
    }

    public void clickEntityNameFields(){
        waitForElementToBeClickable(entityNameField);
        click("Click EntityNameField", entityNameField);
    }

    public void typeTextEntityName(String entityName ){
        waitForElementToBeClickable(entityNameField);
        //String string = "Element Present";
        type("write string", entityName, entityNameField);
    }

    public void selectRandomListElement(){
        waitForElementToBeClickable(entityTypeField);
        selectDropDownListRandomOption("select random element", entityTypeField);
    }

    public void clickPrivateButton(){
        waitForElementToBeClickable(privateOption);
        click("Click private button", privateOption);
    }

    public void typeTextBlackBoxName(String blackBoxName){
        waitForElementToBeClickable(blackboxNameField);
        //String string = "BlackBox Element Present";
        type("write string", blackBoxName, blackboxNameField);
    }

    public void clickEntityTypeServer(){
        waitForElementToBeClickable(entityTypeServer);
        click("click entity type element server", entityTypeServer);
    }

    public void clickEntityTypeDatabase(){
        waitForElementToBeClickable(entityTypeDatabase);
        click("click entity type element database", entityTypeDatabase);
    }

    public void clickEntityTypeApplication(){
        waitForElementToBeClickable(entityTypeApplication);
        click("click entity type element server", entityTypeApplication);
    }

    public void clickEntityTypeHardware(){
        waitForElementToBeClickable(entityTypeHardware);
        click("click entity type element hardware", entityTypeHardware);
    }

    public void clickEntityTypeBusinessProcess(){
        waitForElementToBeClickable(entityTypeBusinessProcess);
        click("click entity type element hardware", entityTypeBusinessProcess);
    }


    // public void clickEntityTypeButton(){
        //click("click submitbutton", submitButton);
    //}
//    public void setEntityName(String entityName){
//        waitForElementVisibility(entityNameField);
//        click("Click 'Entity Name Field' button", entityNameField);
//        type("Set ' " + entityName + "'", entityName, entityNameField);
//
//    }

//    public void setBlackboxName(String blackboxName){
//        waitForElementToBeClickable(blackboxNameField);
//        type("Set ' " + blackboxName + "'", blackboxName, blackboxNameField);
//    }

//    public void clickReportButton(){
//        waitForElementToBeClickable(reportButton);
//        click("Click 'Submit' button", reportButton);
//    }

//    public void clickFormsiteButton(){
//    waitForElementToBeClickable(formsiteButton);
//    click("Click 'Submit' button", formsiteButton);
//    }

//    public boolean isPrivateOpionChecked(){
//        return isCheckboxChecked(privateOption);
//    }












}
