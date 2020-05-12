package com.sysco.automation_web_UI.page;

import org.openqa.selenium.By;

public class CartPage extends HomePage{
    protected By lblCartCount = By.xpath("//*[@class=\"counter qty\"]/span");
    protected By btnCart = By.xpath("//*[@class=\"showcart-trigger header-sidebar-link -cart\"]");
    protected By btnRemoveCartItem = By.xpath("//*[@class=\"action delete\"]");
    protected By btnOk = By.xpath("//*[@class=\"action-primary action-accept button -secondary\"]");

    public  String getlblCartCount(){
        syscoLabUI.waitTillElementLoaded(lblCartCount);
        return syscoLabUI.getText(lblCartCount);
    }

    public boolean isAvailable(){
        return syscoLabUI.isDisplayed(lblCartCount);
    }
    public void clickCartButton(){
        if(isAvailable()){
            int cartCount = Integer.parseInt(getlblCartCount());
            if(cartCount >= 0){
                syscoLabUI.click(btnCart);
                syscoLabUI.click(btnRemoveCartItem);
                syscoLabUI.click(btnOk);
            }
        }

    }

}
