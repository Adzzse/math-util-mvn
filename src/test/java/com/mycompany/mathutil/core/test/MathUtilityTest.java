/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mathutil.core.test;

import com.mycompany.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DoHoangAnh
 */
public class MathUtilityTest {
//Test Case #1 - Verify getFactorial (n = 0)
    @Test

    public void verifyFactorialGivenRightArgument0ReturnOK() {
        assertEquals(1, MathUtility.getFactorial(0));
    }

    @Test
    public void verifyFactorialGivenRightArgument5ReturnOK() {
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    
}
