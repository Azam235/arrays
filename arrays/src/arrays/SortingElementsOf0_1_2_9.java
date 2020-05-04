package arrays;

import java.util.Arrays;

public class SortingElementsOf0_1_2_9 {
	
	static void swap(int A[], int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	
	static void sort(int[] A) {
		int start=0,mid=0;
		int end=A.length-1;
		int pivot=1;
		while (mid <= end)
		{
			if (A[mid] < pivot)		 
			{
				swap(A, start, mid);
				++start;
				++mid;
			}
			else if (A[mid] > pivot)	
			{
				swap(A, mid, end);
				--end;
			}
			else					
			{
				++mid;
			}
		}

		
	}
	
	public static void main(String[] s){
		int A[] = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
		sort(A);
		System.out.println(Arrays.toString(A));
	}
}
