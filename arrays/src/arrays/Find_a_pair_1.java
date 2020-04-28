package arrays;

import java.util.HashMap;
import java.util.Map;

public class Find_a_pair_1 {
	public static void findPair(int[] arr,int sum) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(sum-arr[i])) {
				System.out.println("the pair found at index "+map.get(sum-arr[i])+" "+i);
			}
			map.put(arr[i],i);
		}
	}
	public static void main(String[] s) {
		int arr[]= {8,7,2,5,3,1};
		int sum=10;
		findPair(arr,sum);
	}
}
