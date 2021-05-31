package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for (int j=num; j>0; j--) {
			
			for (int i=0; i<j; i++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		for (int i=1; i<num; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}System.out.println("");
		}
		

		sc.close();

	}

}
















/* 과제 냈던거
	System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		
		for (int i =num ; i>0; i--) {
			
			for (int j = 0; j<i; j++) { 
			System.out.print("*");
			
			
			}
			System.out.println("");

		}
		
		for (int i =1 ; i<num; i++) {
			
			for (int j = 0; j<=i ; j++) { 
			System.out.print("*");
			
			
			}
			System.out.println("");

		}
 */































		
		/*
		for (int i =0 ; i<=num; i++) {
			
			for (int j = (num-i); j>0; j--) { 
			System.out.print("*");
			
			
			}
			System.out.println("");
		
		}
		
		for (int i =0 ; i<=num; i++) {
			
			for (int j = 0; j<=i ; j++) { 
			System.out.print("*");
			
			
			}
			System.out.println("");
		
		}
		*/

