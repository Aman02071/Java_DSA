	package CL_DSA;
import java.util.*;
public class Bubble_sort {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        bubblesort(arr);
        display(arr);
	}
	public static void bubblesort(int[] arr) {
		int n = arr.length;
		for(int itr=1; itr <= n - 1;itr++) {
			for(int i=0 ; i <= n - itr - 1;i++) {
				if(isSmaller(arr,i+1,i) == true) {
					swap(arr,i+1,i);
				}
			}
		}
	}
	
	
	public static boolean isSmaller(int[] arr,int i,int j) {
		if(arr[i] < arr[j]) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void display(int[] arr) {
		for(int i=0 ; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}