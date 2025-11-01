import java.util.ArrayList;

public class CoreJava2 {
	public static void main(String[] args) {
		int numbers[] = {11,22,33,44,55};
		System.out.println(numbers[0]);
		System.out.println(numbers[numbers.length-1]);
		
		
		for(int i = numbers.length-1; i>=0; i--) {
			System.out.println(numbers[i]);
		}
		
		int count=0;
		for(int i=0; i<numbers.length; i++) {
			count++;
		}
		
		System.out.println("Length = "+count);
		
		
		
		
		ArrayList<String> a = new ArrayList<>();
		a.add("Harish");
		a.add("Rahul");
		a.add("emids");
		a.add("USA");
		a.add("London");
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		for(String x : a ) {
			System.out.println(x);
		}
		
		System.out.println(a.contains("USA"));
	}
	

	

}
