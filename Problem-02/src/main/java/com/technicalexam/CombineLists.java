package com.technicalexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineLists {
    public static void main(String[] args) {
        List<Object> list01 = Arrays.asList("a", "b", "c");
        List<Object> list02 = Arrays.asList(1,2,3);

        List<Object> combineList = combineList(list01, list02);
        System.out.println(combineList);
    }

    /**
     * Combine two lists
     * @param list01
     * @param list02
     * @return combined list
     */
    public static List<Object> combineList(List<Object> list01, List<Object> list02){
        if (list01.size() != list02.size()){
            System.out.println("List sizes are not matched");
            return Arrays.asList();
        }

        List<Object> combinedList = new ArrayList<>();
        for (int i = 0; i < list01.size(); i++) {
            combinedList.add(list01.get(i));
            combinedList.add(list02.get(i));
        }
        return combinedList;
    }
}
