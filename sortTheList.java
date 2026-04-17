package com.strings;
import java.util.*;

public class sortTheList {
    public static void main(String[] args) {
    		List<String> words = new ArrayList<>(Arrays.asList("pie","kiwi","banana","apple","mango"));
    		words.sort((s1,s2)->{
    			int diff=s1.length()-s2.length();
    			if(diff!=0)
    			{
    				return diff;
    			}
    			else
    			{
    				return s1.compareTo(s2);
    			}
    		});
    		System.out.println(words);
    }
}
