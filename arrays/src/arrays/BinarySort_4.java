package arrays;

import java.util.Arrays;

public class BinarySort_4 {
	public static void sort(int[] arr) {
		int zeros=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				zeros++;
			}
		}
		int k=0;
		while(zeros--!=0) {
			arr[k++]=0;
		}
		while(k<arr.length) {
			arr[k++]=1;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] s) {
		int[] arr= {0, 0, 1, 0, 1, 1, 0, 1, 0, 0};
		sort(arr);
	}

}
