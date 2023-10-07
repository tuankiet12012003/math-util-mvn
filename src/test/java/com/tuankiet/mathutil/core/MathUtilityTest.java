/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tuankiet.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author TuanKiet
 */
public class MathUtilityTest {
    
    //Cấu trúc test case: ID | Desc | Steps/Procedures | Expected Result | Status
    //Test Case #1 - Verify getFactorial(with n= 0)
    //Steps:
    //          1.Given n = 0
    //          2. Call/ invoke getFactorial(n = 0)
    //Expected Result:
    //                  the method must return 1 as the result of 0!
    //Status: PASSED | FAILED đoán xem, chờ code xong, chạy mới biết được
    
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    //Test Case #2 - Verify getFactorial(with n= 1)
    //Steps:
    //          1.Given n = 1
    //          2. Call/ invoke getFactorial(n = 1)
    //Expected Result:
    //                  the method must return 1 as the result of 1!
    //Status: PASSED | FAILED đoán xem, chờ code xong, chạy mới biết được
    
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    //Test Case #3 - Verify getFactorial(with n= 5)
    //Steps:
    //          1.Given n = 5
    //          2. Call/ invoke getFactorial(n = 5)
    //Expected Result:
    //                  the method must return 120 as the result of 5!
    //Status: PASSED | FAILED đoán xem, chờ code xong, chạy mới biết được
    
    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOk() {
        assertEquals(120, MathUtility.getFactorial(5));
    }
}
