package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		
		for (int j=1; j<=num; j++) {
			for (int i=1; i<=j; i++) {
				System.out.print(i); 
			}
			System.out.println("");
			
		}

		sc.close();
	}

}
