package arrays;

import java.util.*;

class Pair{
	int first,second;
	Pair(int a,int b){
		first=a;
		second=b;
	}
}

public class SubAraysOfSum0_2 {
	
	public static ArrayList<Pair> SubArrays(int[] arr, int n) {
		Map<Integer,ArrayList<Integer>> map=new HashMap<>();
		ArrayList<Pair> out=new ArrayList<>();
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum==0) {
				out.add(new Pair(0,i));
			}
			ArrayList<Integer> al=new ArrayList<>();
			if(map.containsKey(sum)) {
				al=map.get(sum);
				for(int j=0;j<al.size();j++) {
					out.add(new Pair(al.get(j)+1,i));
				}
			}
			al.add(i);
			map.put(sum,al);
		}
		return out;
	}
	
	 static void print(ArrayList<Pair> out) 
	    { 
	            for (int i = 0; i < out.size(); i++) 
	            { 
	                Pair p = out.get(i); 
	                System.out.println("Subarray found from Index "
	                        + p.first + " to " + p.second);  
	            } 
	    } 
	 
	public static void main(String[] s) {
		int[] arr= {6,3,-1,-3,4,-2,2,4,6,-12,-7};
		int n=arr.length;
		ArrayList<Pair> out =SubArrays(arr,n);
		
		if(out.size()==0) {
			System.out.println("no sub array exist");
		}
		else {
			print(out);
		}
	}
}
