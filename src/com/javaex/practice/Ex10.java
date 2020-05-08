package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		System.out.println("숫자를 입력하세요");
		
		for(int row = 1; row<= 5; row++) {
			System.out.print("숫자: ");
			int i = sc.nextInt();
			if(i>max) {
				max=i;
			}
		}
		System.out.println("최대값은 "+max+"입니다.");

		
		sc.close();
	}
	
}
