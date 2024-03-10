package lec_2;
import java.util.*;

public class pattern_4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 int n = scn.nextInt();
		 
		 int row = 1;
		 int nst = n;
		 while(row<=n) {
			 int i =1;
			 while(i<=nst) {
				 System.out.print("*");
				 i = i+1;
			 }
			 nst = nst - 1;
			 
			 System.out.println();
			 row = row+1;
		 }
		 
		 
		 
		// TODO Auto-generated method stub

	}

}
