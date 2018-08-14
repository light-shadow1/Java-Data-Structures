package com.example.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tanujain on 8/2/2018.
 */
public class wordBreak {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String s = "aaaaaaa";
        List wordDict = new ArrayList<String>(Arrays.asList("aaaa", "aaa"));
        wordBreak obj = new wordBreak();
        obj.wordBreak(s,wordDict);
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean result = false;
        int beginIndex = 0;

        for(int i = beginIndex; i <= s.length(); i++ ) {
            String substr = s.substring(beginIndex , i);
            if(wordDict.contains(substr)){
                result = true;
                beginIndex = i;
                System.out.println("Word is "+ substr);
            } else {
                result = false;
            }
        }

        return result;
    }

}
