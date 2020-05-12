package com.sysco.automation_web_UI.function;

import com.sysco.automation_web_UI.page.LoginPage;

public class Login extends NavigateHomePage {
    static LoginPage loginPage = new LoginPage();

    public static void enterLoginDetails(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }

    public static void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    public static String getErrorMessage(){
        return loginPage.getErrorMessage();
    }

}