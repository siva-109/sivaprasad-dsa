package com.strings;
/*import java.util.Arrays;
public class anagramcheck
{
	    public static void main(String[] args) 
	    {
	        String s1 = "listen";
	        String s2 = "silent";

	        char[] arr1 = s1.toCharArray();
	        char[] arr2 = s2.toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        if (Arrays.equals(arr1,arr2))
	        {
	            System.out.println("Anagram");
	        } else
	        {
	            System.out.println("Not Anagram");
	        }
	    }	    
}*/
public class anagramcheck{
public static boolean isAnagram(String s,String t) {
	if(s.length()!=t.length())
    {
		return false;
	}
	int arr[] = new int[26];
	for(int i= 0;i<s.length();i++) {
		arr[s.charAt(i)-'a']++;
		arr[t.charAt(i)-'a']--;
	}
	for(int count:arr) {
		if(count!=0) {
			return false;
		}
	}
	return true;
}
public static void main(String[] args) {
	System.out.println(anagramcheck.isAnagram("silent","listen"));
}
}


