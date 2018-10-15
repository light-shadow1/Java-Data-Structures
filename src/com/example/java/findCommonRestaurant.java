package com.example.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tanujain on 8/29/2018.
 */
public class findCommonRestaurant {

        public String[] findRestaurant(String[] list1, String[] list2) {

                List<String> al1 = Arrays.asList(list1);
                List<String> al2 = Arrays.asList(list2);
                int indexTotal = -1; int temp = 0;
                List<String> result = new ArrayList<>();
                for (int i = 0; i < al1.size(); i++ ) {
                    temp = al2.indexOf(al1.get(i));
                    if(  temp != -1) {
                        // we found common restaurant
                        if (indexTotal > i + temp) {
                            indexTotal = i + temp;
                            result.clear();
                            result.add(al1.get(i));
                        } else if(indexTotal == i + temp)  {
                            result.add(al1.get(i));
                        } else {
                            if(indexTotal == -1 ){
                                // first time
                                indexTotal = i + temp;
                                result.add(al1.get(i));
                            }
                        }
                    }
                }
                return result.toArray(new String[0]);

        }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        findCommonRestaurant obj = new findCommonRestaurant();
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        obj.findRestaurant(list1, list2);
    }

}
