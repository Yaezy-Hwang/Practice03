package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int i = sc.nextInt();
		
		for(int row = i; row>0; row--) {
			for(int d = i; d>0; d--) {
				System.out.print("*");
			}
			System.out.println("");
			i--;
		}
		
		sc.close();
	}

}
