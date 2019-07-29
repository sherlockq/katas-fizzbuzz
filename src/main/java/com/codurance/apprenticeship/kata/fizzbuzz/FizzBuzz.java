package com.codurance.apprenticeship.kata.fizzbuzz;

public class FizzBuzz {
    public String print(int inputNumber) {
        if (inputNumber % 5 == 0 && inputNumber % 3 == 0)
            return "FizzBuzz";
        if (inputNumber % 3 == 0)
            return "Fizz";
        if (inputNumber % 5 == 0)
            return "Buzz";


        return Integer.toString(inputNumber);
    }

    public String printAll() {
        return "Buzz";
    }
}
