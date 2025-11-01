public class CoreJava {

	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=780;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int arr1[] = {11,12,14,19,34};
		
		for(int x:arr1) {
			System.out.println(x);
		}
	}

}
