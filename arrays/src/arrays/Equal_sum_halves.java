package arrays;
import java.util.*;
public class Equal_sum_halves {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Character.getNumericValue(s.charAt(i));
		}
		int length=0;
		boolean yes=false;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if((j-i)%2!=0) {
					int x=i,y=j;
					int sum1=0,sum2=0;
					while(x<y) {
						sum1=sum1+arr[x];
						sum2=sum2+arr[y];
						x++;
						y--;
					}
					if(sum1==sum2 && (j-i)>length) {
						length=j-i;
						for(int k=i;k<=j;k++) {
							System.out.print(arr[k]);
						}
						yes=true;
					}
				}
			}
		}
		if(!yes) {
			System.out.println(-1);
		}
	}
}
