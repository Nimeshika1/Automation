package com.sysco.automation_web_UI.function;

import com.sysco.automation_web_UI.page.HomePage;

public class NavigateHomePage {
    static HomePage homePage= new HomePage();

    public static void navigateAthletesFootHomePage(){
        homePage.openAthletesFootHomePage();
    }

    public static boolean isAvailabileLoginBtn(){
       return homePage.isAvailabileLoginBtn();
    }

    public static void clickLoginBtn(){
        homePage.clickLoginBtn();

    }

     public static void quitDriver(){
        homePage.quitDriver();
    }

}
