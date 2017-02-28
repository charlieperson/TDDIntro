package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int high) throws IllegalArgumentException {
        if(high<0) throw new IllegalArgumentException("Number cannot be below 0");
        int product = 1;
        for(int i=1; i<=high; i++) {
            product *= i;
        }
        return product;
    }
}

//Testing git configuration
