package org.junit;

import org.lesson2.Calculator;

public class TestCalculator {

    @Test
    public void testAdding(){
        Calculator calculator = new Calculator(2,'+',2);
        Double actualResult = calculator.calculate();

        Assert.assertEquals(actualResult,4,0);
    }

    @Test
    public void testAddingNegative(){
        Calculator calculator = new Calculator(2,'+',2);
        Double actualResult = calculator.calculate();

        Assert.assertEquals(actualResult,3,0);
    }
}
