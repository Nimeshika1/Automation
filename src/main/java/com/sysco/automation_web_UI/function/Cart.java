package com.sysco.automation_web_UI.function;

import com.sysco.automation_web_UI.page.CartPage;

public class Cart extends CartPage {
    static CartPage cartPage = new CartPage();

   public static void clickCartBtn(){
       cartPage.clickCartButton();
   }
}
