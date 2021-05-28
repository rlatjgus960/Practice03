package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x = 23;
		boolean action = true;
		
		System.out.println("======================");
		System.out.println("   [숫자맞추기게임 시작]   ");
		System.out.println("======================");
		
		while (action) {
			boolean action2 = true;
			
			System.out.print(">>");
			int num = sc.nextInt();
			sc.nextLine(); //int 받은 다음에 String 받으려면 꼭 써주기
			
			if(num>x) {
				System.out.println("더 낮게");
				
			}else if(num<x) {
				System.out.println("더 높게");
				
			}else if(num==x) {
				System.out.println("맞았습니다.");
				
				while (action2) {
					System.out.print("게임을 종료하시겠습니까?(y/n)>>");
					String game = sc.nextLine();
					if (game.equals("y")) {
						System.out.println("======================");
						System.out.println("   [숫자맞추기게임 종료]   ");
						System.out.println("======================");
						action = false;
						action2 = false;
					}else if (game.equals("n")) {
						System.out.println("======================");
						System.out.println("   [숫자맞추기게임 재시작]   ");
						System.out.println("======================");
						action2 = false;
					}else {
						System.out.println("잘못 입력하셨습니다.\n");
					}
				}
			}
			
			
		}
		
		
		
		sc.close();

	}

}
