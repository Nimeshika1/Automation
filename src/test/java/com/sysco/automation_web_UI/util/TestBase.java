package com.sysco.automation_web_UI.util;
import com.sysco.automation_web_UI.function.NavigateHomePage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    @BeforeClass
    public void init(){
        NavigateHomePage.navigateAthletesFootHomePage();
    }
    @AfterClass
    public void updateMethod(){
//        NavigateHomePage.quitDriver();
    }
}
