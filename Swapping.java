import java.util.Arrays;

public class Swapping {
	
	public static void main(String[] args) {
		
		int[] arr= { 1, 0, 1, 0, 1, 0, 0, 1 } ;
		binarySort(arr);
		int[] ter = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 } ;
		binarySortThree(ter);
	}

	public static void binarySort(int[] arr) {
		int pivot = 1;
		int j =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<pivot) {
				swap(arr,i,j);
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j] = temp;
	}
	
	public static void binarySortThree(int[] ter) {
		int pivot = 1;
		int mid = 0;
		int start = 0;
		int end = ter.length-1;
		while(mid<=end) {
			if(ter[mid]<pivot) {
				swap(ter,start,mid);
				++start;
				++mid;
			}
			else if(ter[mid]>pivot) {
				swap(ter,mid,end);
				--end;
			}
			else {
				++mid;
			}
		}
		System.out.println(Arrays.toString(ter));
	}
	
	

}
