package lec_2;

public class Bin_to_dec {

	public static void main(String[] args) {
		int n = 101101;
		int ans = 0;
		int mul = 1;
		while(n !=0) {
			int rem = n %10;
			ans = ans +rem*mul;
			mul= mul*2;
			n = n/10;
			
		}
		System.out.println(ans);
		// TODO Auto-generated method stub

	}

}
