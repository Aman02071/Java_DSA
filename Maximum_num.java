package lec_2;
import java.util.*;

public class Maximum_num {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		if ( a > b && a > c) {
			System.out.println(" a is maximum");
		}
		
		else if ( b > c) {
			System.out.println(" b is maximum");
		}
		
		else {
			System.out.println(" c is maximum");
		}
		// TODO Auto-gene{
		

	}

}
