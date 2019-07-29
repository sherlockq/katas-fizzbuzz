package com.codurance.apprenticeship.kata.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    @Test
    void returnOneWhenInputOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 1;
        String output = fizzBuzz.print(inputNumber);

        assertEquals("1", output);
    }
}
