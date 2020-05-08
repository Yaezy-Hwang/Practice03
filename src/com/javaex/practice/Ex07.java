package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();
		
		for(int row = 1; row<=num; row++) {
			for(int d = 1; d<=row; d++) {
				System.out.print(row);
			}
			System.out.println("");
		}
		
		
		sc.close();
	}

}
