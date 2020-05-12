package com.sysco.automation_web_UI.function;

import com.sysco.automation_web_UI.page.CategoryPage;

public class Category extends CategoryPage {
    static CategoryPage categoryPage = new CategoryPage();

    public static void clickWomanCategory(){
        categoryPage.clickWomen();
    }
    public static void clickItemOfWomanCategory(){
        categoryPage.clickItem();
    }
}
