package com.technicalexam;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static java.lang.System.out;

public class SumByWhileLoop {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30 ,40);
        Iterator<Integer> iterator = numbers.iterator();
        int sum = 0;
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        out.println(sum);
    }
}
