package com.algorithms.basicprograms;
import java.util.Scanner;
public class Factorial {
	static int fact(int num) {
		int result=1;
		for(int i=1;i<=num;i++) {
			result *= i;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.print(fact(num));
	}

}
