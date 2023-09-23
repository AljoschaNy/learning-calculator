package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void add_whenNumber1Is5AndNumber2Is6_thenReturn11 () {
        //GIVEN
        double number1 = 5;
        double number2 = 6;
        //WHEN
        double actual = Calculator.add(number1, number2);
        //THEN
        double expect = 11;
        assertEquals(expect, actual);
    }

    @Test
    void sub_whenNumber1Is6AndNumber2Is3_thenReturn3() {
        //GIVEN
        double number1 = 6;
        double number2 = 3;
        //WHEN
        double actual = Calculator.sub(number1,number2);
        //THEN
        double expect = 3;
        assertEquals(expect,actual);
    }

}