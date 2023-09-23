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
}