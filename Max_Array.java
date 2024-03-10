package lec_2;

public class Max_Array {

	public static void main(String[] args) {
		int [] arr = {3,5,1,7,8,6};
		System.out.println(max(arr));
		
		
		// TODO Auto-generated method stub

	}
	
	public static int max(int[] arr) {
		int m = arr[0];
		for(int i =1;i<arr.length;i++) {
			if(arr[i]>m) {
				m = arr[i];
				
			}
		}
		return m;
	}

}
