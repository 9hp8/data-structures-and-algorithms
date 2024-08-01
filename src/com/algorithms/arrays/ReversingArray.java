package com.algorithms.arrays;

import java.util.Scanner;

public class ReversingArray {
	Scanner scan = new Scanner(System.in);

	public int[] reverseFunction(int num[]) {
		int start=0;
		int end=num.length-1;
		
		while(start<end) {
			int temp = num[start];
			num[start] = num[end];
			num[end] = temp;
			start++;
			end--;
		}
		return num;
	}
	
	public int[] inputArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]= scan.nextInt();
		}
		return arr;
	}
	public void printResult(int[] num) {
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		ReversingArray reversingArray = new ReversingArray();
		int[] arr = new int[5];
		
		int[] input = reversingArray.inputArray(arr);
		
		int[] result = reversingArray.reverseFunction(input);
		
		reversingArray.printResult(result);
		
	}

}
