package com.cydeo.tests;

import com.page.CalculatorPage;
import org.junit.jupiter.api.Test;

public class CalculatorPOMTest {

    CalculatorPage calculatorPage=new CalculatorPage();

    @Test
    public void multiplyTest(){
        calculatorPage.clickDigit(5);
        calculatorPage.multiply.click();
        calculatorPage.clickDigit(8);
    }
}
