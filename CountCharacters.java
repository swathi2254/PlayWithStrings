package com.ineuron.string.practice;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string here : ");
		String test = sc.nextLine();
		test.toLowerCase();//@#
		String characters = "";
		int count =0;
		for(int i=0;i<test.length();i++) {
			if(test.charAt(i) >'a'  && test.charAt(i) <'z'|| test.charAt(i) >='0' && test.charAt(i) <='9') {
				
			}else
				{
				count ++;
				characters = characters+test.charAt(i)+" ";
				}
				
		}
		System.out.println("Special Characters Count is  " +count);
		System.out.println("Special Characters are "+characters);
	}

}
