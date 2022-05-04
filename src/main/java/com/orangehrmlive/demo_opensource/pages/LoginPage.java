package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameField = By.id("txtUsername");
    By passwordField = By.id("txtPassword");
    By loginBtnField = By.id("btnLogin");
    By welcomeTextField = By.id("welcome");
    By forgotPasswordBtn = By.xpath("//a[contains(text(),'Forgot your password?')]");
    By forgotPasswordTextField = By.xpath("//h1[contains(text(),'Forgot Your Password?')]");

    public void userName(String value){
        sendTextToElement(userNameField,value);
    }
    public void password(String value){
        sendTextToElement(passwordField,value);
    }
    public void clickOnLogin(){
        clickOnElement(loginBtnField);
    }
    public void clickOnForgotPassword(){
        clickOnElement(forgotPasswordBtn);
    }
    public String welcomeMessage(){
        return getTextFromElement(welcomeTextField);
    }
    public String forgotPasswordMessage(){
        return getTextFromElement(forgotPasswordTextField);
    }

}
