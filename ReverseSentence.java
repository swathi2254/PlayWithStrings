package com.ineuron.string.practice;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		String temp = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String: ");
		String input =sc.nextLine();
		String[] a = input.split(" ");
		for(int j = 0;j<a.length;j++) {
		for(int i =a[j].length()-1;i>=0;i--) {
			temp = temp+a[j].charAt(i);
		}
		temp = temp +" ";
		
	}
		System.out.println("Input String is : "+input);
		System.out.println("Reversed String is "+temp);
	}
}
