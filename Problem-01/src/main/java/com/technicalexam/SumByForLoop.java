package com.technicalexam;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class SumByForLoop {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30 ,40);
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        out.println(sum);
    }
}
