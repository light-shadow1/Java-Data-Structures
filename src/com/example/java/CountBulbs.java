package com.example.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tanujain on 9/19/2018.
 * The bulbs are off and ON but faulty wiring. Anytime you flip a bulb ON, it flips everything to its right. How many minimum bulbs need to be flipped to get all of them ON.
 */
public class CountBulbs {

        public int bulbs(ArrayList<Integer> a) {
            int num_Ways = 0;
            boolean flipped = false;
            return bulbs_h(a , 0 , flipped);

        }
        public int bulbs_h(ArrayList<Integer> a, int index, boolean flip) {
            System.out.print(" Before Flip :: ");
            print_b(a);
            if(flip) {
                for(int i = index; i < a.size(); i++)
                    a.set(i,a.get(i)^1) ;
                System.out.print(" After Flip :: ");
                print_b(a);
            }
            if(index > a.size() - 1)
                return 0;
            if(a.get(index) == 0) {
                a.set(index,a.get(index)^1);
                return 1 + bulbs_h(a, index + 1, !flip);
            }
            else
                return bulbs_h(a , index+1,flip);

        }
        public void print_b(ArrayList<Integer> a) {
            for(Integer i : a) {
               // System.out.print(i + " ");
            }
        }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        CountBulbs obj = new CountBulbs();
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 0, 0, 1, 1, 0, 0, 1));

        System.out.println("Number of Bulbs Flipped" + obj.bulbs(a));
    }


}
