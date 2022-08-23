package com.ineuron.string.practice;

import java.util.Scanner;

public class CountConsonantsAndVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String here : ");
		String test = sc.nextLine();
		int cCount =0;
		int vCount = 0;
		String vowels ="";
		String Consonants ="";
		test.toLowerCase();
		for(int i =0;i<test.length();i++) {
			if(test.charAt(i)=='a' || test.charAt(i)=='e' || test.charAt(i)=='i' || test.charAt(i)=='o' || test.charAt(i)=='u') {
				vCount++;
				vowels = vowels +test.charAt(i) +" ";
				
			} else if(test.charAt(i)>='a' || test.charAt(i) <='z') {
				cCount++;
				Consonants = Consonants +test.charAt(i) +" ";
			}
		}
		System.out.println("Vowels count is: "+vCount);
		System.out.println("VOWELS are : " +vowels);
		System.out.println("Consonants count is: "+cCount);
		System.out.println("Consonants are : " +Consonants);
	}

}
