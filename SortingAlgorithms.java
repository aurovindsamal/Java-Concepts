import java.util.Arrays;

public class SortingAlgorithms {
	public static void main(String[] args) {
		bubbleSort();
		selectionSort();
		insertionSort();
		
	}
	
	public static void bubbleSort() {
		int[] arr = {3,4,7,1,2,8};
		for(int i=0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort() {
		int[] arr = {11,3,4,7,1,2,8,23};
		for(int i=0;i<arr.length-1;i++) {
			int min = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min]= arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertionSort() {
		int[] arr = {3,4,9,7,1,2,10,8};
		for(int i=1;i<arr.length;i++) {
			int value = arr[i];
			int j = i;
			while(j>0 && arr[j-1]>value) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j] = value;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void mergeSort() {
		int[] arr = {15,3,4,9,7,11,1,2,10,8};
	}

}
