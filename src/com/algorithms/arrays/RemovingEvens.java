package com.algorithms.arrays;

import java.util.Scanner;

public class RemovingEvens {

	public void filterEven(int[] myArray) {
		int n = myArray.length;
		for (int i = 0; i < n; i++) {
			if (myArray[i] % 2 != 0) {
				System.out.print(myArray[i] + " ");
			}

		}
	}

	//storing the odd values in new array 
	public int[] oddArray(int[] arr) {
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddCount++;
			}
		}
		int[] result = new int[oddCount];
		int rCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				result[rCount] = arr[i];
				rCount++;
			}
		}
		return result;
	}
	public void printResult(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		RemovingEvens removingEvens = new RemovingEvens();

		int[] myArray = new int[5];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = scan.nextInt();
		}
		removingEvens.filterEven(myArray);
		
		int[] result = removingEvens.oddArray(myArray);
		removingEvens.printResult(result);

	}

}
