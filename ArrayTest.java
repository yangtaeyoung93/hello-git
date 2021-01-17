package array;

public class ArrayTest {
	public static void main(String[] args) {
		
		//int[] arr = new int[] {1,2,3};
		//int[] arr ={1,2,3};
		
		int total = 0;
		
		int [] arr = new int[10];
		
		for(int i = 0 , num = 1; i < arr.length; i++ , num++) {
			arr[i] = num;
			
			total += arr[i];
			
		}
		
		System.out.println(total);
		
		
		double[] dArr = new double[5];
		
		int count = 0;
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		
		double dtotal = 1;
		for (int i = 0; i < count; i++) {
			dtotal *= dArr[i];
		}
		System.out.println(dtotal);
		
		
	}
}
