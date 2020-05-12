package com.sysco.automation_web_UI.tests;

import com.sysco.automation_web_UI.data.DashBoardData;
import com.sysco.automation_web_UI.data.LoginData;
import com.sysco.automation_web_UI.function.*;
import com.sysco.automation_web_UI.util.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestAthletesFoot extends TestBase {
    static LoginData loginData = new LoginData();
    static DashBoardData dashBoardData = new DashBoardData();

    @Test(priority = 1)
    public void verifyLoginButtonAVilability(){
        Assert.assertTrue(NavigateHomePage.isAvailabileLoginBtn());
    }

    @Test(priority = 2)
    public void verifyLoginSection(){
        NavigateHomePage.clickLoginBtn();
        Login.enterLoginDetails(loginData.getValidEmail(), loginData.getInvalidPassword());
        Login.clickLoginButton();
        Assert.assertEquals(Login.getErrorMessage(),loginData.getErrorMessage());

        Login.enterLoginDetails(loginData.getInvalidEmail(), loginData.getValidPassword());
        Login.clickLoginButton();
        Assert.assertEquals(Login.getErrorMessage(),loginData.getErrorMessage());

        Login.enterLoginDetails(loginData.getInvalidEmail(), loginData.getInvalidPassword());
        Login.clickLoginButton();
        Assert.assertEquals(Login.getErrorMessage(),loginData.getErrorMessage());

        Login.enterLoginDetails(loginData.getValidEmail(), loginData.getValidPassword());
        Login.clickLoginButton();
        Assert.assertEquals(DashBoard.getUserData(),dashBoardData.getUserData());

        Cart.clickCartBtn();

    }
    @Test(priority = 3)
    public void verifyItemDetails(){
        Category.clickWomanCategory();
        Category.clickItemOfWomanCategory();
        AddidasWoman.clickProduct();
        AddToCart.clickAddToCartBtn();
    }

}
