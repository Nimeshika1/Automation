package com.sysco.automation_web_UI.page;

import org.openqa.selenium.By;

public class DashBoardPage extends HomePage{
    protected By lblUserName = By.xpath("//*[@class=\"box box-information\"]/div/p");

    public String getUserName(){
        return syscoLabUI.getText(lblUserName);
    }
}
