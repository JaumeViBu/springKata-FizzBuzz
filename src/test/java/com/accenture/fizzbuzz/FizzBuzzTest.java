package com.accenture.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void executeReturnsFizzIfNumDivisibleBy3() {
        //GIVEN
        var fizzbuzz= new FizzBuzz();
        //WHEN
        var sut=fizzbuzz.execute(3);
        //THEN
        assertEquals("Fizz",sut);
    }

    @Test
    void executeReturnsBuzzIfNumDivisibleBy5() {
        //GIVEN
        var fizzbuzz= new FizzBuzz();
        //WHEN
        var sut=fizzbuzz.execute(5);
        //THEN
        assertEquals("Buzz",sut);
    }

    @Test
    void executeReturnsFizzBuzzIfNumDivisibleBy3And5() {
        //GIVEN
        var fizzbuzz= new FizzBuzz();
        //WHEN
        var sut=fizzbuzz.execute(15);
        //THEN
        assertEquals("FizzBuzz",sut);
    }

    @Test
    void executeReturnsGivenValueIfNumNonDivisibleBy3Or5() {
        //GIVEN
        var fizzbuzz= new FizzBuzz();
        //WHEN
        var sut=fizzbuzz.execute(7);
        //THEN
        assertEquals("7",sut);
    }
}