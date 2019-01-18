package com.test.pages;


import com.test.base.BasePage;
import com.test.locators.CSS;
import com.test.locators.ID;
import com.test.locators.Locator;
import com.test.locators.XPath;

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

    Locator entityNameField = new ID("RESULT_TextField-2");
    Locator blackboxNameField = new ID("//*[@id=\"RESULT_TextField-4\"]");
    Locator privateButton = new ID("//*[@id=\"RESULT_CheckBox-3_0\"]");
    Locator submitButton = new ID("//*[@id=\"FSsubmit\"]");
    Locator entityTypeButton = new ID("//*[@id=\"RESULT_RadioButton-1\"]");
    Locator reportButton = new ID("//*[@id=\"FSForm\"]/div[2]/div[10]/a[2]");
    Locator formsiteButton = new ID("//*[@id=\"FSForm\"]/div[2]/div[10]/a[1]");
    Locator selector = new ID("RESULT_RadioButton-1");
    Locator privateOption = new ID("RESULT_CheckBox-3_0");

    public void setEntityName(String entityName){
        waitForElementVisibility(entityNameField);
//        click("Click 'Entity Name Field' button", entityNameField);
//        selectDropDownListOptionByText("Select ' " + entityName + "'", entityName, );
//        type("Set ' " + entityName + "'", entityName, entityNameField);
    }

    public void setBlackboxName(String blackboxName){
        waitForElementToBeClickable(blackboxNameField);
//        type("Set ' " + blackboxName + "'", blackboxName, blackboxNameField);
    }

    public void clickPrivateButton(){
        waitForElementToBeClickable(privateButton);
        click("Click 'Private' button", privateButton);
    }

    public void clickSubmitButton(){
        waitForElementToBeClickable(submitButton);
        click("Click 'Submit' button", submitButton);
    }

    public void clickReportButton(){
        waitForElementToBeClickable(reportButton);
        click("Click 'Submit' button", reportButton);
    }

    public void clickFormsiteButton(){
        waitForElementToBeClickable(formsiteButton);
        click("Click 'Submit' button", formsiteButton);
    }

    public boolean isPrivateOpionChecked(){
        return isCheckboxChecked(privateOption);
    }












}
