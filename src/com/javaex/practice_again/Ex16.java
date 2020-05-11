package com.javaex.practice_again;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum, multi;

		System.out.println("5의 배수의 개수"+"\t"+": "+num/5);
		
		for(sum = 0, multi = 5; multi<num; multi+=5) {
			if(multi%5==0) {
				sum+=multi;
			}
			sc.close();
		}
		System.out.println("5의 배수의 합"+"\t"+": "+sum);
		
	}
}
