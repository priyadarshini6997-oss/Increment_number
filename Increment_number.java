package com.index;

import java.util.Scanner;

public class Increment_number {

	public static void main(String[] args) {
		System.out.println("Enter a number within 10");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num<10) {
			num++;
			System.out.println(num);
		}	
		sc.close();

	}

}
