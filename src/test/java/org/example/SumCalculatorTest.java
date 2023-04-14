package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    @BeforeEach
    @Test
    public void testCalculateSum3() {
        int actual = new SumCalculator().sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @BeforeEach
    @Test
    public void testCalculateSum1() {
        int actual = new SumCalculator().sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @BeforeEach
    @Test
    public void testCalculateSum0() {
        Assertions.assertThrows(IllegalArgumentException.class,()-> SumCalculator.sum(0));
    }
    }

