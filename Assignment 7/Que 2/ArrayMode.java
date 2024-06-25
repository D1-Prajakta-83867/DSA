package com.sunbeam;


import java.util.HashMap;
import java.util.Map;

public class ArrayMode {

    public static void main(String[] args) {
        int[] array = {1, 6, 3, 4, 6, 6, 3, 5, 6, 6, 2};
        
        int mode = findMode(array);
        
        System.out.println("Mode of the array is: " + mode);
    }
    
    public static int findMode(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : array) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }
        
        int mode = 0; 
        int maxCount = 0; 
        
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        
        return mode;
    }
}
