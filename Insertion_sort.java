package CL_DSA;

import java.util.*;

public class Insertion_sort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		insertionSort(arr);
		display(arr);

	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (isGreater(arr, j - 1, j) == true) {
					swap(arr, j - 1, j);
				} else {
					break;

				}

			}
		}
	}

	public static boolean isGreater(int[] arr, int j, int i) {
		if (arr[i] < arr[j]) {
			return true;
		} else {
		}
		return false;
	}



	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

public static void display(int[]arr) {
	for(int i =0;i<arr.length;i++) {
		System.out.println(arr[i]);
		
	}
}
}