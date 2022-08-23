package com.ineuron.string.practice;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String test = sc.nextLine();
		char[] word = test.toCharArray();
		
		   for(int i=0;i<(word.length-1);i++){
		        for(int j=i+1;j>0;j--){
		            if(word[j]<word[j-1]){//a<w
		                char temp=word[j-1];
		                word[j-1]=word[j];
		                word[j]=temp;
		            }
		        }
		    }
		     System.out.println(word);
		    }
	}

