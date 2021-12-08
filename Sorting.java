import java.util.Arrays;

public class Sorting {
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) { //the i is in there to make the code more efficient
				if (arr[j]>arr[j+1]) {
				/*	//Swap with temporary variable
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp; */
					//Swap without using temporary variable
					arr[j]=arr[j] ^ arr[j+1]; //^ is the exclusive OR
					arr[j+1]=arr[j] ^ arr[j+1];
					arr[j]=arr[j] ^ arr[j+1];
			} }
		}
	}
	
//Task: Implement and research about the insertionSort and selectionSort
	public static void insertionSort(int[] arr) {
		for (int i=1; i<arr.length; ++i) {
			int j=i;
			while ((j>0) && (arr[j-1]>arr[j])) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				--j;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; ++i) {
			int minIndex=i;
			for(int j=i+1; j<arr.length; ++j) {
				if (arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int [] numbers= {4,1,2,3,5};
		bubbleSort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		insertionSort(numbers);
	//	System.out.println(Arrays.toString(numbers));
		
		selectionSort(numbers);
	//	System.out.println(Arrays.toString(numbers)); 
	}
}
