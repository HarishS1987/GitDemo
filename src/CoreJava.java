public class CoreJava {

	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0]=1000000;
		arr[1]=2000000;
		arr[2]=3000000;
		arr[3]=4000000;
		arr[4]=7800000;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int arr1[] = {11,12,14,19,34};
		
		for(int x:arr1) {
			System.out.println(x);
		}
	}

}
