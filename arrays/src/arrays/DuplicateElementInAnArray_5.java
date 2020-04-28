package arrays;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementInAnArray_5 {
	
	public static int foundDuplicate(int[] A) {
		boolean visited[] = new boolean[A.length];

		for (int i = 0; i < A.length; i++)
		{
			if (visited[A[i]]) {
				return A[i];
			}

			visited[A[i]] = true;
		}

		return -1;

	}
	public static void main(String[] s) {
		int[] A= {1,2,3,2,4,5,2,2};
		System.out.println("Duplicate element is " + foundDuplicate(A));
	}
}