package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		int sum = 0;
		
		
		for (int i=1; i<=n; i++) {
		
			if(i%2==0 && n%2==0) {
				sum = sum+i;
				
						
			}else if(i%2==1 && n%2==1){
				sum=sum+i;
			}
			
		}
		System.out.println("결과값 : " + sum);
		
		sc.close();
				

	}

}
