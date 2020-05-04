package arrays;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayEqual0and1s_8 {
	
	public static void maxLenSubarray(int[] A) {
		int sum=0,len=0; int ending_index=-1;
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0,-1);
		for(int i=0;i<A.length;i++) {
			sum+=((A[i]==0)?-1:1);
			if(map.containsKey(sum) && len<i-map.get(sum)) {
				len=i-map.get(sum);
				ending_index=i;
			}
			else {
				map.put(sum,i);
			}
		}
		if(ending_index!=-1)
			System.out.println("["+(ending_index-len+1)+".."+ending_index+"]");
		else
			System.out.println("sub array doesn't exist");
	}
	
	public static void main (String[] args)
	{
		int[] A = { 0, 0, 1, 0, 1, 0, 0 };

		maxLenSubarray(A);
	}
}
