package arrays;



public class ConsecutiveSubArray {
	
	static boolean isConsecutive(int[] arr,int i, int j, int min, int max) {
		
		boolean visited[]=new boolean[j-i+1];
		if(max-min!=j-i) {
			return false;
		}
		
		for(int k=i;k<j;k++) {
			if(visited[arr[k]-min]) {
				return false;
			}
			visited[arr[k]-min]=true;
		}
		return true;
	}
	
	static int min(int x, int y)  
    { 
        return (x < y) ? x : y; 
    } 
  
    static int max(int x, int y)  
    { 
        return (x > y) ? x : y; 
    } 
  
    static void longestSubArray(int arr[], int n)  
    { 
        int length=1;
        int start=0, end=0;
        for(int i=0;i<n-1;i++) {
        	int mn=arr[i], mx=arr[i];
        	for(int j=i+1;j<n;j++) {
        		mn=min(mn,arr[j]);
        		mx=max(mx,arr[j]);
        		
        		if(isConsecutive(arr,i,j,mn,mx)) {
        			if(length<mx-mn+1) {
        				length=mx-mn+1;
        				start=i;
        				end =j;
        			}
        		}
        		
        	}
        	
        }
        System.out.println("The largest sub array is from index "+start+" to "+end);
    } 
    
    public static void main(String[] s) {
	
     int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45}; 
     int n = arr.length; 
     longestSubArray(arr,n);
     
}
}