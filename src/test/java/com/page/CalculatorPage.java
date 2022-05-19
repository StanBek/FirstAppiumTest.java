package com.page;

import com.cydeo.utils.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    public CalculatorPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);
    }

    @AndroidFindBy(accessibility = "multiply")
    public MobileElement multiply;

    public void clickDigit(int digit){
        String id = "com.google.android.calculator:id/digit_"+digit;
        MobileElement number = Driver.getDriver().findElement(By.id(id));
        number.click();
    }
}
