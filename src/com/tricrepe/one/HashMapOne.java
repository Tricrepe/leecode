package com.tricrepe.one;

import java.util.HashMap;
import java.util.Map;

public class HashMapOne {
    public static int[] twoSums(int[] arr, int target){
        Map <Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target-arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        throw new IllegalArgumentException("No solution");
    }
}
