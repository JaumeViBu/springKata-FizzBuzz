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
}