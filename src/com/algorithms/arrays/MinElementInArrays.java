package com.algorithms.arrays;

import java.util.Scanner;

public class MinElementInArrays {

	Scanner scan = new Scanner(System.in);
	public int minValue(int[] arr) {
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		
		int[] arr = {90, 34, 66, 12, 3, 10, 1, 12};
		
		MinElementInArrays minelement = new MinElementInArrays();
		int min = minelement.minValue(arr);
		System.out.print(min);
	}

}
