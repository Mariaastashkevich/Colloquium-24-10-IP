package com.example.task41;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
public class OneFactorial {
    public ArrayList<Long> calc(int n) throws NegativeValueException {
        ArrayList<Long> nFactorials = new ArrayList<>();
        if(n < 0) {throw new NegativeValueException("N is lesser than zero! Factorial cannot be calculated.");}
        if (n == 0) {
            nFactorials.add(1L);
        } else {
            Long cur_num = 1L;
            for (int i = 1; i <= n; i++) {
                cur_num *= i;
                nFactorials.add(cur_num);
            }
        }
        return nFactorials;
    }

}
