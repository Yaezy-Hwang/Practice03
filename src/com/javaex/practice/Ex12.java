package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fac = 1;
		System.out.println("숫자를 입력하세요.");
		int i = sc.nextInt();
		
		while(i>0) {
			fac *= i;
			i--;
		}

		System.out.println("결과값: "+fac);
		
		sc.close();
	}

}
