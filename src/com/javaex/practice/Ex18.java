package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int i = sc.nextInt();

		for(int row = 0; row<i; row++) {
			for(int d = row; d<i; d++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int row=1; row<i; row++) {
			for(int d = 0; d<=row; d++) { 
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();
	}

}
