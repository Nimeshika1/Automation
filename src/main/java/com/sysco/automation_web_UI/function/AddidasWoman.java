package com.sysco.automation_web_UI.function;

import com.sysco.automation_web_UI.page.AdidasWomanPage;

public class AddidasWoman extends AdidasWomanPage {
    static AdidasWomanPage adidasWomanPage = new AdidasWomanPage();

    public static void clickProduct(){
        adidasWomanPage.clickProductOne();
    }

}
