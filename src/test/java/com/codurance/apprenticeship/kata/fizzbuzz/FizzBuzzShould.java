package com.codurance.apprenticeship.kata.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzShould {
    @Test
    void return1WhenInputIs1() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String output = fizzBuzz.print(1);

        assertEquals("1", output);
    }

    @Test
    void returnFizzWhenInputIs3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String output = fizzBuzz.print(3);

        assertEquals("Fizz", output);
    }

    @Test
    void return1WhenInputIs2() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String output = fizzBuzz.print(2);

        assertEquals("2", output);
    }

    @Test
    void returnBuzzWhenInputIs5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String output = fizzBuzz.print(5);

        assertEquals("Buzz", output);
    }

    @Test
    void returnFizzWhenInputIs6() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String output = fizzBuzz.print(6);

        assertEquals("Fizz", output);
    }

    @Test
    void returnBuzzWhenInput10() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String output = fizzBuzz.print(10);

        assertEquals("Buzz", output);

    }

    @Test
    void returnFizzBuzzWhenInput15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String output = fizzBuzz.print(15);

        assertEquals("FizzBuzz", output);

    }

    @Test
    void returnAStringEndsWithBuzzWhenPrintAll() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String output = fizzBuzz.printAll();


        assertTrue(output.endsWith("Buzz"));
    }
}