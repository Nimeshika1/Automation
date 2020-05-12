package com.sysco.automation_web_UI.page;

import org.openqa.selenium.By;

public class CategoryPage extends HomePage{
    protected By btnWoman = By.xpath("//*[@class=\"item -parent -level1\"][1]");
    protected By btnItem = By.xpath("//*[@id=\"mi-3-2-2-1\"]");

    public void clickWomen(){
        syscoLabUI.waitTillElementLoaded(btnWoman);
        syscoLabUI.click(btnWoman);
    }
    public void clickItem(){
        syscoLabUI.click(btnItem);
    }
}
