package com.sysco.automation_web_UI.page;

import org.openqa.selenium.By;

public class AddToCartPage extends HomePage{
    protected By btnAddToCart = By.id("product-addtocart-button");
    protected By lblItemPrice = By.id("//*[@id=\"product-price-326752\"]");
    protected By lblItemName = By.xpath("//*[@class=\"base\"]");

    public void clickAddToCartButton(){
        syscoLabUI.click(btnAddToCart);
    }

    public String getItemPrice(){
        return syscoLabUI.getText(lblItemPrice);
    }

    public String getItemName(){
        return syscoLabUI.getText(lblItemName);
    }
}

