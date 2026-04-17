package com.collections.practice;
import java.util.*;
public class arrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		al.add(23);
		al.add(24);
		al.add(26);
		al.add(28);
		Collections.sort(al);
		System.out.println("ascending:"+al);
		Collections.reverse(al);
		System.out.println("descending:"+al);
		System.out.println(al.get(0));
		System.out.println(al.set(1,30));
		System.out.println(al.remove(1));
		System.out.println(al.size());
		System.out.println(al.contains(23));
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf(23));
		//al.clear();
		//System.out.println("after clear:"+al);
		//al.lastIndexOf(al);
		System.out.println(al.lastIndexOf(26));
		al2.addAll(al);
		System.out.println("after adding:"+al2);
		al.clone();
		System.out.println("after cloning:"+al);
		
	}
}
