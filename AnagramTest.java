package com.ineuron.string.practice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String s1 = sc.next();
		
		System.out.println("Enter the Second String");
		String s2 = sc.next();
		
		s1 = s1.toLowerCase();
		s2= s2.toLowerCase();
	
		if(s1.length() == s2.length()) {
			char a1[] = s1.toCharArray();
			char a2[] = s2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			if(Arrays.equals(a1, a2)) {
				System.out.println("These Strings " +s1.toUpperCase() +" and "+s2.toUpperCase() +" are Anagrams");
			}
			else System.out.println("These Strings " +s1.toUpperCase() +" and "+s2.toUpperCase() +" are not Anagrams !!!");
			
		} else 
			System.out.println("These Strings " +s1.toUpperCase() +" and "+s2.toUpperCase() +" are not Anagrams !!!");

	}

}
