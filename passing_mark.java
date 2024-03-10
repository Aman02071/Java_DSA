package lec_2;
import java.util.*;
public class passing_mark {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int marks =  scn.nextInt();
		
		if( marks > 90) {
			System.out.println("Grade is O");
		} else if (marks >80  && marks <= 90) {
			System.out.println("Grade is A +");
			
		} else  if (marks >70  && marks <= 80) {
			System.out.println(" Grade is B");
		} else {
			System.out.println("fail");
		}
				
	}
	

}
