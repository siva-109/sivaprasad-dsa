package com.strings;
public class palindromestring {
	public static void main(String[] args) {
		String s = "madam";
		char[] arr = s.toCharArray();
		int left = 0;
		int right = arr.length-1;
		
		while(left<right) {
			if(arr[left]==arr[right])
			{
				left++;
				right--;
			}else {
				System.out.println("is not palindrome");
				break;
			}
		}
		System.out.println("is a palindrome");
	}
}
