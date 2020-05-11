package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int category=0;
		while(category!=4) {
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			category = sc.nextInt();
		
			switch (category) {
				case 1:
					System.out.print("예금액> ");
					System.out.println(1500);
					break;
					
				case 2:
					System.out.print("출금액> ");
					System.out.println(700);
					break;
					
				case 3:
					System.out.print("잔고액> ");
					System.out.println(800);
					break;
					
				case 4:
					System.out.print("프로그램 종료");
					break;
					
					
				default:
					System.out.println("다시 입력해주세요");
					break;
			}
	
		}
		
		sc.close();
		
	}

}
