package com.javaex.practice_again;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int row = 1; row<=num; row++) {
			for(int col = row; col<=num; col++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		sc.close();
	}

}
