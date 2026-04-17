package com.strings;

public class palindrome2 {
    public static void main(String[] args) {
        String str = "A man,a plan,a canal:Panama";
        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) 
            {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right)))
            {
                right--;
            }
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right)))
            {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
