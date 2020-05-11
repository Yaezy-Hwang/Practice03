package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int q = (int)(Math.random()*100)+1;
		int a = 0;
		
		System.out.println("====================================");
		System.out.println("     [숫자 맞추기 게임 시작]");
		System.out.println("====================================");
		
		System.out.println("확인용 :"+q);
		

		while(q!=a) {
			System.out.print(">>");
			a = sc.nextInt();
			if (q>a) {
				System.out.println("더 높게");
			} else if (q<a) {
				System.out.println("더 낮게");
			} else {
				System.out.println("맞았습니다.");
			}

		}

		System.out.println("====================================");
		System.out.println("     [숫자 맞추기 게임 종료]");
		System.out.println("====================================");
		
		sc.close();
	}

}
