package lec_2;

public class method_2 {
	public static void main (String[] args) {
		System.out.println("cb");
		int a = 4;
		int b =11;
		Add(a,b);
		int ans = Add(a,b);
		System.out.println(ans);
		System.out.println("bye");
	}
	public static int Add(int a,int b) {
		int c = a+b;
		//c = c+Sub(b,c);
		return c;
	}
	
//	public static int Sub(int a , int b) {
//		int c= a-b;
//		return c;
//	}

}
