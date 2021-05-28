package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x = 23;
		boolean action = true;
		
		
		while (action) {
			
			System.out.print(">>");
			int num = sc.nextInt();
			
			if(num>x) {
				System.out.println("더 낮게");
				
			}else if(num<x) {
				System.out.println("더 높게");
				
			}else if(num==x) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n)");
				System.out.print(">>");
				String game = sc.nextLine();
								
				if (game.equals("y")) {
					action = false;
					System.out.println("======================");
					System.out.println("[숫자맞추기게임 종료]");
					System.out.println("======================");
				}else if (game.equals("n")) {
					action = false;
				}
			}
			
			
		}
		
		
		
		

	}

}
