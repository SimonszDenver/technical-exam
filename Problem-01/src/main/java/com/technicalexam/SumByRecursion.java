package com.technicalexam;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class SumByRecursion {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30 ,40);
        int sum = computeSum(numbers, numbers.size());
        out.println(sum);
    }

    /**
     * Compute sum in recursion
     * @param numbers
     * @param size
     * @return
     */
    public static int computeSum(List<Integer> numbers, int size){
        if (size <= 0){
            return 0;
        } else {
            return computeSum(numbers, size-1) + numbers.get(size - 1);
        }
    }
}
