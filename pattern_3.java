package lec_2;
import java.util.*;
public class pattern_3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row = 1;
		
		while(row <=5) {
			
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
