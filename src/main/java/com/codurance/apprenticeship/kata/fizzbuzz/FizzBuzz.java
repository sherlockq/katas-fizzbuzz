package com.codurance.apprenticeship.kata.fizzbuzz;

public class FizzBuzz {
    public String print(int inputNumber) {
        if(inputNumber == 3)
            return "Fizz";
        if(inputNumber == 5)
            return "Buzz";
        return inputNumber + "";
    }
}
