package CL_DSA;

import java.util.Scanner;

public class passing_array_function {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int[] arr = new int [n];
		for(int i =0;i<n;i++) {
			arr[i]= scn.nextInt();
		}
		
		
		for(int i =0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
