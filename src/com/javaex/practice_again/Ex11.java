package com.javaex.practice_again;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		int sum;
		
		for(sum=0; num>0; num-=2) {
			sum+=num;
		}
		
		System.out.print("결과값: ");
		System.out.println(sum);
		
		sc.close();
	}
}
