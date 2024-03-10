package lec_2;

public class Reverse_array_range {

	public static void main(String[] args) {
		int [] arr = {3,5,7,1,9,4,8,90,54,67,32,78,65};
		Reverse(arr, 2 ,6);
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		// TODO Auto-generated method stub

	}
	public static void Reverse(int[] arr,int i ,int j) {
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
	}

}
