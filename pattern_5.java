package lec_2;

import java.util.Scanner;

public class pattern_5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row = 1;
		int n_dash = n-1;
		int nst = 1;
		
		while(row<=n) {
			
			int i =1;
			while(i<=n_dash) {
				System.out.print("-");
				i= i+1;
				
			}
			
			int j = 1;
			while(j<=nst) {
				System.out.print("*");
				j=j+1;
				
			}
			n_dash = n_dash-1;
			nst = nst+1;
			
			System.out.println();
			row = row+1;
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
