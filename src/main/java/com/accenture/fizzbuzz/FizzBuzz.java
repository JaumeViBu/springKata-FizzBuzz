package com.accenture.fizzbuzz;

public class FizzBuzz {
    String execute(Integer num){

        String res="";

        if(numIsMultipleOf(num,3))res+= "Fizz";
        if(numIsMultipleOf(num,5))res+= "Buzz";
        if(res.isEmpty())res+=num.toString();

        return res;
    }

    Boolean numIsMultipleOf(Integer num, Integer base) {

       return num%base==0;
    }
}
