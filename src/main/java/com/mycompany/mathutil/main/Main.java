package com.mycompany.mathutil.main;

import com.mycompany.mathutil.core.MathUtility;

/**
 *
 * @author DoHoangAnh
 */
public class Main {

    public static void main(String[] args) {
        //Test case #1
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);

        System.out.println(n + "! -> expected: " + expected + " | actual = " + actual);

        //Test case #2
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);

        System.out.println(n + "! -> expected: " + expected + " | actual = " + actual);

        //Test case #3
        n = 2;
        expected = 2;
        actual = MathUtility.getFactorial(n);

        System.out.println(n + "! -> expected: " + expected + " | actual = " + actual);

        //Test case #4
        n = 5;
        expected = 120;
        actual = MathUtility.getFactorial(n);

        System.out.println(n + "! -> expected: " + expected + " | actual = " + actual);
    }
}
