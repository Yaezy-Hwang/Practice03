package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int x = sc.nextInt();
		
		for(int s = 1; x>=s; s++) {
			if(x%s==0) {
				System.out.println(s);
			}
		}
		
		sc.close();
	}

}
