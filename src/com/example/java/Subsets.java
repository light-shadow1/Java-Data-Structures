package com.example.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tanujain on 8/15/2018.
 */
public class Subsets {

        public List<List<Integer>> subsets(int[] nums) {
            List numList = new ArrayList<Integer>(nums.length);
            for (int i = 0; i < nums.length; i++)
                numList.add((nums[i]));
            return findSubsets(numList);


        }

    public List<List<Integer>> findSubsets(List<Integer> numList) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numList.size() == 0) {
            result.add(numList);
            // return the empty subset or list
        } else {
            // recursion
            List<List<Integer>> results = new ArrayList<List<Integer>>();
            Integer element = numList.remove(0);
            result = findSubsets(numList);
            for(List list: result){
                List<Integer> newList = new ArrayList<Integer>(list.size()+1);
                newList.addAll(list);
                newList.add(element);
                results.add(newList);
            }
            for(List list: results){
                result.add(list);
            }

        }
        return result;
    }
        public static void main(String[] args) {
            System.out.println("Hello, World!");
            int[] array =  { 1, 2, 3} ;
            Subsets obj = new Subsets();
            //print the returned object below
            obj.subsets(array);

    }

}
