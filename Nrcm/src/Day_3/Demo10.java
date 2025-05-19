package Day_3;

public class Demo10 {
	public static void main(String[] args) {
		int arr[]= {23, 34, 56};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			
		}
		System.out.println("min: " + min);
	}

}
