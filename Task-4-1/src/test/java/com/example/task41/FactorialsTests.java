package com.example.task41;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
// testing using Mockito
@ExtendWith(MockitoExtension.class)
class FactorialsTests {
    @Test
    void testCalculate() throws NegativeValueException {
        OneFactorial factorial;
        Factorials factorials;
        factorial = Mockito.mock(OneFactorial.class);
        factorials = new Factorials(factorial);
        int n = 4;
        ArrayList<Long> exp = new ArrayList<>();
        exp.add(1L);
        exp.add(2L);
        exp.add(6L);
        exp.add(24L);
        when(factorial.calc(n)).thenReturn(exp);
        ArrayList<Long> actual = factorials.calculate(n);
        assertEquals(exp, actual);
    }
}