package com.sysco.automation_web_UI.function;

import com.sysco.automation_web_UI.page.DashBoardPage;

public class DashBoard extends DashBoardPage {
    static DashBoardPage dashBoardPage = new DashBoardPage();

    public static String getUserData(){
        return dashBoardPage.getUserName();
    }
}
