package com.ineuron.string.practice;

import java.util.Scanner;

public class PangramTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String test = sc.nextLine(); //"The quick brown fox jumps over the lazy dog";//sc.nextLine();
		System.out.println(test);
		boolean[] list = new boolean[26];
		int index=0;
		boolean flag= true;
	//	test = test.toLowerCase();
		for(int i =0;i< test.length();i++) {
			  if ( test.charAt(i) >= 'A' && test.charAt(i) <= 'Z') {
		            index = test.charAt(i) - 'A';
		         }else if( test.charAt(i) >= 'a' && test.charAt(i) <= 'z') {
		            index = test.charAt(i) - 'a';
		      }
			list[index]=true;
		}
		for(int i=0;i<list.length;i++) {
			
		if(list[i] == false) {
			flag = false;
		}
		
		}	
		if(flag)
			System.out.println("The string is Pangram!!!");
		else System.out.println("This is not Pangram!!!");
	}

}
