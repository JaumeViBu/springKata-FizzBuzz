package com.accenture.fizzbuzz;

public class FizzBuzz {
    String execute(Integer num){
        if(num%3==0)return "Fizz";
        if(num%5==0)return "Buzz";
        return "";
    }
}
