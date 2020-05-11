package com.javaex.practice_again;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		for(int div=1; num>=div; div++) {
			if(num%div==0) {
				System.out.println(div);
			}
		}
		
		sc.close();
	}
}
