package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("숫자를 입력하세요.");
		int i = sc.nextInt();
		
		while(i>0) {
			sum += i;
			i = i-2;
		}

		System.out.println("결과값: "+sum);
		
		sc.close();
	}

}
