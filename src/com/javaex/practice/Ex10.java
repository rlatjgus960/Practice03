package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int n;
		int m = 0;
		
		for (int i=0; i<5; i++) {
			System.out.print("숫자: ");
			n = sc.nextInt();
			if (n>m) {
				m=n;
			}
		}
		
		System.out.println("최대값은 "+m+" 입니다.");
			
		
		sc.close();

	}

}
