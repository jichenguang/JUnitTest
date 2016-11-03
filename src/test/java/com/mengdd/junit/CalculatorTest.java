package com.mengdd.junit;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;



//public class CalculatorTest  extends TestCase


public class CalculatorTest
{
	@Test
    public void testAdd()
    {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        // 判断方法的返回结果
        assertEquals(3, result);// 第一个参数是期望值，第二个参数是要验证的值
    }

    public void testSubtract()
    {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(1, 2);
        // 判断方法的返回结果
        assertEquals(-1, result);// 第一个参数是期望值，第二个参数是要验证的值

    }

    public void testMultiply()
    {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 3);
        // 判断方法的返回结果
        assertEquals(6, result);// 第一个参数是期望值，第二个参数是要验证的值

    }

    public void testDivide()
    {
        Calculator calculator = new Calculator();
        int result = calculator.divide(12, 3);
        // 判断方法的返回结果
       assertEquals(4, result);// 第一个参数是期望值，第二个参数是要验证的值

    }


}