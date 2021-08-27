package com.technicalexam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.*;

public class LargestPossibleNumber {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(5, 2, 1, 9);
        int i = largestPossibleNumber(numberList, numberList.size());
        out.println(i);
    }

    /**
     * Calculate the largest possbile Number
     * @param digits
     * @param size of the list
     * @return largest possible number
     */
    public static int largestPossibleNumber(List<Integer> digits, int n){
        Collections.sort(digits);
        int num = 0;
        for(int i = n - 1; i >= 0; i--){
            num = num * 10 + digits.get(i);
        }
        return num;
    }
}
