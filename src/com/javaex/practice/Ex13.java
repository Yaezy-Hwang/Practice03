package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		int x = sc.nextInt();
		
		int sum = 0;
		int inc = 1;
		
		while(inc<=x) {
			sum = sum+inc;
			System.out.print("+"+sum);
			inc++;
		} System.out.println("");
			 
		System.out.println("합계: "+sum);
		
		sc.close();
	}

}
