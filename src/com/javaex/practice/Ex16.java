package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int i = sc.nextInt();
		
		System.out.println("5의 배수의 갯수: "+i/5);
		
		int num, sum;
		for(num = 5, sum = 0; num<=i; num+=5) {
				sum = sum+num;
		}
		
		
		System.out.println("5의 배수의 합  : "+sum);
		
		sc.close();
	}

}
