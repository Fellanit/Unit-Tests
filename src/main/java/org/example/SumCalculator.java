package org.example;


import java.util.stream.IntStream;

public class SumCalculator {
    public static int sum(int n) throws IllegalArgumentException {
        if (n <= 0) {
            throw new IllegalArgumentException("Input number can't be less or equal 0");
        }
        return IntStream.rangeClosed(0, n).sum();
    }
}