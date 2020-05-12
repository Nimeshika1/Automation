package com.sysco.automation_web_UI.page;

import com.sysco.automation_web_UI.common.Constants;
import com.sysco.automation_web_UI.util.DriverEnvironmentSetUpUtil;
import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;

public class HomePage {
    protected static SyscoLabUI syscoLabUI;
    protected By btnLogin = By.xpath("//*[@class=\"top-links\"]/li[1]/a");

    public void openAthletesFootHomePage(){
        DriverEnvironmentSetUpUtil.setToRunLocally();
        syscoLabUI = new SyscoLabWUI(null);
        syscoLabUI.navigateTo(Constants.APP_URL);
        syscoLabUI.driver.manage().window().maximize();
    }

    public boolean isAvailabileLoginBtn(){
        syscoLabUI.waitTillElementLoaded(btnLogin);
        return syscoLabUI.isDisplayed(btnLogin);
    }

    public void clickLoginBtn(){
        syscoLabUI.click(btnLogin);
        syscoLabUI.sleep(5);
    }

    public void quitDriver(){
        syscoLabUI.quit();
    }

}
