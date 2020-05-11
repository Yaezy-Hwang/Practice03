package com.javaex.practice_again;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		int sum, add;
		for(sum=0, add=1; add<=num; add++) {
			sum+=add;
		}

		System.out.print("합계:"+sum);
		
		sc.close();

	}
}
