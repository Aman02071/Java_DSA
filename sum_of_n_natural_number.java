package lec_2;

import java.util.Scanner;

public class sum_of_n_natural_number {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int i = 1;
		 int sum = 0;

		while (i <= n) {
			sum = sum+i;
			
			i = i + 1;
		}
		System.out.println(sum);

		// TODO Auto-generated method stub

	}

}
