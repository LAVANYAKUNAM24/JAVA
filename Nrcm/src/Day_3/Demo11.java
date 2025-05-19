package Day_3;

public class Demo11 {
	public static void main(String[] args) {
		int arr[]= {23, 34, 56};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}
		System.out.println("max: " + max);
	}

}
