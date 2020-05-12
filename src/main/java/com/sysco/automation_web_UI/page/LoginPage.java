package com.sysco.automation_web_UI.page;

import org.openqa.selenium.By;

public class LoginPage extends HomePage{
    protected By txtEmail = By.xpath("//*[@id=\"email\"]");
    protected By txtPassword = By.xpath("//*[@id=\"pass\"]");
    protected  By btnLogin = By.id("send2");
    protected By lblErrorMessage = By.xpath("//*[@class=\"messages\"]/div/div");

    public void enterEmail(String email){
        syscoLabUI.sendKeys(txtEmail, email);
    }
    public void enterPassword(String password){
        syscoLabUI.sendKeys(txtPassword,password);
    }
    public void clickLoginButton(){
        syscoLabUI.click(btnLogin);
    }
    public String getErrorMessage(){
        syscoLabUI.waitTillElementLoaded(lblErrorMessage);
        return syscoLabUI.getText(lblErrorMessage);
    }


}
