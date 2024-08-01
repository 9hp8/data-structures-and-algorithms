package com.algorithms.arrays;

public class ArrayInitialization {

	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i =0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void arrayDemo() {
		int[] myArray = new int[5];
		myArray[0] = 5;
		myArray[1] = 4;
		myArray[2] = 7;
		myArray[3] = 9;
		myArray[4] = 19;
		
		//updating index 4
		myArray[3] = 37;
		printArray(myArray);
		
		//finding length of the array
		System.out.println(myArray.length);
		
		//access the last element of the array
		System.out.println(myArray[myArray.length-1]);
		
	}
	public static void main(String[] args) {
		ArrayInitialization arrayInitialization = new ArrayInitialization();
		arrayInitialization.arrayDemo();
	}

}
