package lec_2;

public class Reverse_Array {

	public static void main(String[] args) {
		int [] arr = {3,5,7,1,9,4};
		Reverse(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
				
		// TODO Auto-generated method stub

	}
	public static void Reverse(int[] arr) {
		int i =0;
		int j = arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
	}

}
