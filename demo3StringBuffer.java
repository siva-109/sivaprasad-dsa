package com.strings;

public class demo3StringBuffer
{
	    public static void main(String[] args)
	    {

	        StringBuffer sb = new StringBuffer("Shiva");
	        sb.append(" Jakki");
	        System.out.println("append: " +  sb.insert(5, ","));
	        System.out.println("insert: " + sb);
	        sb.replace(0, 5, "Hi");
	        System.out.println("replace: " + sb);
	        sb.delete(2, 4);
	        System.out.println("delete: " + sb);
	        sb.deleteCharAt(2);
	        System.out.println("deleteCharAt: " + sb);
	        sb.reverse();
	        System.out.println("reverse: " + sb);
	        System.out.println("length: " + sb.length());
	        System.out.println("capacity: " + sb.capacity());
	        sb.ensureCapacity(50);
	        System.out.println("ensureCapacity(50): " + sb.capacity());
	        System.out.println("charAt(1): " + sb.charAt(1));
	        sb.setCharAt(1, 'X');
	        System.out.println("setCharAt: " + sb);
	        System.out.println("substring(0,3): " + sb.substring(0,3));
	        System.out.println("indexOf 'X': " + sb.indexOf("X"));
	        System.out.println("lastIndexOf 'l': " + sb.lastIndexOf("l"));
	        String str = sb.toString();
	        System.out.println("toString: " + str);
	        sb.setLength(5);
	        System.out.println("setLength(5): " + sb);
	    }
	
		
	}

