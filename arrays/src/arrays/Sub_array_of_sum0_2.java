package arrays;

import java.util.HashSet;
import java.util.Set;

public class Sub_array_of_sum0_2 {
	public static boolean sumOfSubArray(int[] arr) {
		Set<Integer> set=new HashSet<>();
		set.add(0);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(set.contains(sum)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] s) {
		int[] arr= {3,4,-7,3,1,3,1,-2,-2};
		if(sumOfSubArray(arr)) {
			System.out.println("sub array of sum 0 is present");
		}
		else {
			System.out.println("sub array of sum 0 is not present");
		}
		
	}
}
