package com.sysco.automation_web_UI.function;

import com.sysco.automation_web_UI.page.AddToCartPage;
import com.sysco.automation_web_UI.page.AdidasWomanPage;

public class AddToCart extends AddToCartPage {
    static AddToCartPage addToCartPage = new AddToCartPage();

    public static void clickAddToCartBtn(){
        addToCartPage.clickAddToCartButton();
    }
    public static String getPriceOfItem() {
        return addToCartPage.getItemPrice();
    }

    public static String getNameOfItem() {
        return addToCartPage.getItemName();
    }

}
