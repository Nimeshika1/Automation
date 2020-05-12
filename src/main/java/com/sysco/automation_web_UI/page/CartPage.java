package com.sysco.automation_web_UI.page;

import org.openqa.selenium.By;

public class CartPage extends HomePage{
    protected By lblCartCount = By.xpath("//*[@class=\"counter qty\"]/span");
    protected By btnCart = By.xpath("//*[@class=\"showcart-trigger header-sidebar-link -cart\"]");

    public  String getlblCartCount(){
        syscoLabUI.waitTillElementLoaded(lblCartCount);
        return syscoLabUI.getText(lblCartCount);
    }

    public void clickCartButton(){
        int cartCount = Integer.parseInt(getlblCartCount());
        if(cartCount >= 0){
            syscoLabUI.click(btnCart);
        }

    }
}
