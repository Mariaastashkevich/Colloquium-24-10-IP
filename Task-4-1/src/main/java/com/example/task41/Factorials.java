package com.example.task41;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Factorials {
private OneFactorial factorial;

    public Factorials(OneFactorial factorial) { this.factorial = factorial; }
    public Factorials() {}
    public ArrayList<Long> calculate(int n) throws NegativeValueException {
        return factorial.calc(n);
    }

}
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}