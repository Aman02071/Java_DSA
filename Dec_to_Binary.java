package lec_2;

public class Dec_to_Binary {

	public static void main(String[] args) {
		int n = 43;
		int ans = 0;
		int mul = 1;
		while(n != 0) {
			int rem = n%2;
			ans = ans+rem*mul;
			mul = mul* 10;
			n =n/2;
			
		}
		System.out.println(ans);
		// TODO Auto-generated method stub

	}

}
