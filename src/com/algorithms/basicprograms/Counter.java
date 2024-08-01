package com.algorithms.basicprograms;
import java.util.Scanner;

public class Counter {
	// Counting the number of digits in a program
	static int countfunc(int num) {
		int count = 0;
		while(num > 0) {
			num = num/10;
			count ++;
		}
		return count;
	}
	public static void main(String[] args) {
//		Algo:
//		1. Check if the numbers exist
//		2. Remove last digit
//		3. Increase value of count by 1
//		4.repeat the steps untill number is 0
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = countfunc(num);
		System.out.println("Number of digits are: "+count);
		
		
	}

}
