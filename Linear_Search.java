package CL_DSA;
import java.util.*;

public class Linear_Search {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int[] arr = new int [n];
		for( int i =0 ; i< n ; i++) {
			arr[i] = scn.nextInt();
		}
		 int data = scn.nextInt() ;
		for (int i = 0;i<arr.length;i++) {
			if( arr[i]== data) {
				System.out.println( "data is present at "+i+" index");
			}
			else {
				System.out.println("data is not present");
			}
			
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
