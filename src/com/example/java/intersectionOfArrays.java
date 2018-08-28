package com.example.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by tanujain on 8/27/2018.
 */
public class intersectionOfArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0 , j = 0;
        Set<Integer> hash = new HashSet<>();
        while (i < nums1.length && j < nums2.length  ) {
            if(nums1[i] < nums2[j]) i++;
            else if(nums1[i] > nums2[j]) j++;
            else {
                hash.add(nums1[i]);
                i++;
                j++;
            }

        }
        return hash.stream().mapToInt(Number::intValue).toArray();
    }
}
