package com.javaex.practice_again;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		int fac;
		
		for (fac=1; num>0; num--) {
			fac*=num;
			sc.close();
		}
		
		System.out.print("결과값: "+fac);
		
	}
}
