package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int sum=0;
		
		for (int i = 1; i<=num; i++) {
			
			for(i = 1; i<num; i++) {
			System.out.print(i+"+");
			}
			System.out.println(i);
			sum=sum+i;
		}
			
			
		System.out.println("결과값: "+sum);
		
		sc.close();

	}

}
