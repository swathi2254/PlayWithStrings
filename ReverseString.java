package com.ineuron.string.practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String temp = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String: ");
		String input = sc.next();
		
		for(int i =input.length()-1;i>=0;i--) {
			temp = temp+input.charAt(i);
		}
		System.out.println("Input String is : "+input);
		System.out.println("Reversed String is "+temp);
	}

}
