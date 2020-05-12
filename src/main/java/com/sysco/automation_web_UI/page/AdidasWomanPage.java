package com.sysco.automation_web_UI.page;

import org.openqa.selenium.By;

public class AdidasWomanPage extends HomePage{

    protected By btnProduct1 = By.xpath("//*[@class=\"product-image-wrapper\"]/div/img");

    public void clickProductOne(){
        syscoLabUI.waitTillElementLoaded(btnProduct1);
        syscoLabUI.click(btnProduct1);
    }
}
