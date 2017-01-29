package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int high) {
        int product = 1;
        for(int i=1; i<=high; i++) {
            product *= i;
        }
        return product;
    }
}
