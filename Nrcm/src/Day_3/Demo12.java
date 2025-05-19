package Day_3;

public class Demo12 {
	public static void main(String[] args) {
		int arr[]= {3,4,6,5,7};
		int arr1[]=new int[arr.length];
		int max =arr[0];
		for(int i =1;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("max:" + max);
	
	}

}
