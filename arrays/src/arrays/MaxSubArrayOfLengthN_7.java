package arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxSubArrayOfLengthN_7 {
	public static void maxLengthSubArray(int[] A, int n) {
		int sum=0;int len=0;
		int ending_index=0;
		Map<Integer,Integer> map= new HashMap<>();
		map.put(0,-1);
		for(int i=0;i<A.length;i++) {
			sum+=A[i];
			if(!map.containsKey(sum)) {
				map.put(sum,i);
			}
			if(map.containsKey(sum-n) && len<i-map.get(sum-n)) {
				len=i-map.get(sum-n);
				ending_index=i;
			}
		}
		System.out.println("["+(ending_index-len+1)+".."+ending_index+"]");
	}
	
	public static void main(String[] s) {
		int[] A = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int sum = 8;
		
		maxLengthSubArray(A, sum);
	}
}
