package com.sysco.automation_web_UI.page;

import org.openqa.selenium.By;

public class AdidasWomanPage extends HomePage{

    protected By btnProduct1 = By.xpath("//*[@class=\"product-image-wrapper\"]/div/img");
    protected By lblPrice = By.xpath("//*[@class=\"product-item-link\"]");
    protected By lblName = By.xpath("//*[@class=\"price\"]");

    public void clickProductOne(){
        syscoLabUI.waitTillElementLoaded(btnProduct1);
        syscoLabUI.click(btnProduct1);
    }

    public String getPrice(){
        return syscoLabUI.getText(lblPrice);
    }

    public String getName(){
        return syscoLabUI.getText(lblName);
    }
}
