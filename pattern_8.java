package lec_2;

import java.util.Scanner;

public class pattern_8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		
		while(row<=n) {
			int i =1;
			System.out.print("");
			i = i+1;
			
			
		}
		
	                                           
		int j= 1;
		while(j<=nst) {
			if(j%2==0) {
				System.out.print("!");
			}else {
				System.out.print("*");
				j= j+1;
			}
			
			nst = nst+2;
			nsp = nsp-1;
			System.out.println("");
			row = row+1;
		}
		// TODO Auto-generated method stub

	}

}
