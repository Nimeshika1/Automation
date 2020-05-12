package com.sysco.automation_web_UI.page;

import org.openqa.selenium.By;

public class DashBoardPage extends HomePage{
    protected By lblUserName = By.xpath("//*[@class=\"box box-information\"]/div[1]/p");

    public String getUserName(){
        syscoLabUI.waitTillElementLoaded(lblUserName);
        System.out.print(syscoLabUI.getText(lblUserName));
        return syscoLabUI.getText(lblUserName);
    }
}
