package com.javaex.practice_again;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = (int)(Math.random()*100)+1;
		int q = 1;
		System.out.println("확인용 : "+a);
		
		System.out.println("===============================");
		System.out.println("   "+"[숫자 맞추기 게임 시작]");
		System.out.println("===============================");
		
		
		while(a!=q) {
			System.out.print(">> ");
			q = sc.nextInt();
			
			if(a>q) {
				System.out.println("더 높게");
			} else if(a<q) {
				System.out.println("더 낮게");
			} else {
				System.out.println("정답입니다.");
			}
		}
		
		System.out.println("===============================");
		System.out.println("   "+"[숫자 맞추기 게임 종료]");
		System.out.println("===============================");
		
	sc.close();	
	}
}
