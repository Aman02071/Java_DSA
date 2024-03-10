package java1_DSA;
import java.util.*;

public class Broken_economy {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int [n];
		 for (int i =0;i<n;i++) {
			 arr[i] = scn.nextInt();
		 }
		  
		 int data = scn.nextInt();
		 int floor =-1;
		 int ceil=-1;
		 int left = 0;
		 int right = n-1;
		 
		 while(left<=right) {
			 int mid = (left+right)/2 ;
			 if(arr[mid]==data) {
				 floor = data;
				 ceil = data;
				 
				 break;
			 }
			 
			 else if (arr[mid]> data) {
				 ceil = arr[mid];
				 right = mid -1;
				 
			 }
			 
			 else {
				 floor = arr[mid];
				 left = mid+1;
				 
			 }
			 
			 
		 }
		 
		 System.out.println(" floor : " + floor);
		 System.out.println(" ceil : " + ceil);
		// TODO Auto-generated method stub

	}

}

