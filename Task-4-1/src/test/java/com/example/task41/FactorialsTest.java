package com.example.task41;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FactorialsTest {

    @Test
    @DisplayName("Factorials are calculated")
    void calculate() throws NegativeValueException {
        OneFactorial factorial = new OneFactorial();
        Factorials fact = new Factorials(factorial);
        Object[] expected = {1L, 2L, 6L, 24L, 120L};
        Object[] calculated = fact.calculate(5).toArray();
        Assertions.assertArrayEquals(expected,calculated);
    }
    @Test
    @DisplayName("Factorial of zero is one")
    void calculate1() throws NegativeValueException {
        OneFactorial factorial = new OneFactorial();
        Factorials fact = new Factorials(factorial);
        Object[] expected = {1L};
        Object[] calculated = fact.calculate(0).toArray();
        Assertions.assertArrayEquals(expected,calculated);
    }
    @Test
    @DisplayName("Factorial of one is one")
    void calculate2() throws NegativeValueException {
        OneFactorial factorial = new OneFactorial();
        Factorials fact = new Factorials(factorial);
        Object[] expected = {1L};
        Object[] calculated = fact.calculate(1).toArray();
        Assertions.assertArrayEquals(expected,calculated);
    }
    @Test
    @DisplayName("Factorials are calculated")
    void calculate3() throws NegativeValueException {
        OneFactorial factorial = new OneFactorial();
        Factorials fact = new Factorials(factorial);
        Object[] expected = {1L, 2L, 6L, 24L, 120L, 720L, 5040L};
        Object[] calculated = fact.calculate(7).toArray();
        Assertions.assertArrayEquals(expected,calculated);
    }


}