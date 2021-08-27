package com.technicalexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciSeries {

    public static void main(String[] args) {
        List<Integer> fibonacci = getFibonacci();
        System.out.println(fibonacci);

    }

    public static List<Integer> getFibonacci(){
        /* Initialize fibannocci arraylist and add 0 1 1 as the initial vlaues*/
        List<Integer> fibonacci = new ArrayList<>();
        int first = 1;
        int second = 1;
        fibonacci.add(0);
        fibonacci.add(first);
        fibonacci.add(second);

        /* compute the fibonacci series */
        while (100 != fibonacci.size()){
            int temp = first + second;
            first = second;
            second = temp;
            fibonacci.add(temp);
        }
        return fibonacci;
    }
}
