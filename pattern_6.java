package lec_2;

import java.util.Scanner;

public class pattern_6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row = 1;
		int nsp = 0;
		int nst = n;
		
		while(row<=n) {
			int i =1;
			while(i<=nsp) {
				System.out.print(" ");
				i = i+1;
			}
			
			int j =1;
			while(j<=nst) {
				System.out.print("*");
				j = j+1;
			}
			
			nsp = nsp +2;
			nst = nst-1;
			
			System.out.println();
			row = row+1;
		}
		
		
		// TODO Auto-generated method stub

	}

}
