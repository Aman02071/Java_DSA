package lec_2;
import java.util.*;

public class pattern_2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		
		int row = 1;
		
		while(row <= 2) {
			
			int i =1;
			while(i<=n) {
				System.out.print("*");
	             i = i+1;
			}
			System.out.println();
			
			row = row+1;
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
