package OA;

import java.util.Arrays;

public class LargestSubArrayK {

	private static int[] subArray(int[] A, int k){
	    int[] res = new int[k];
	    int start = 0;
	    for (int i = 0; i <= A.length - k; i++){
	      for(int j = 0; j < k;j++){
	    	  if(A[i + j] > A[start + j]){
	    		  start = i;
	    		  break;
	    	  }
	    	  if(A[i + j] < A[start + j]){
	    		  break;
	    	  }
	        }
	      }
	    for(int i = 0; i < k; i++){
	      res[i] = A[start + i];
	    }
	    return res;
	}
	
	public static void main(String[] args) {
		int[] A = { 1, 4, 3, 2, 5 };
		int[] B = { 5, 2, 3, 6, 1, 7 };
		int[] C = { 8 };
		int[] D = { 9, 1, 2, 8, 7, 6, 5};
		int[] E = {1, 1, 0, 2, 4};
		LargestSubArrayK l = new LargestSubArrayK();
		System.out.println(Arrays.toString(l.subArray(A, 4)));
		System.out.println(Arrays.toString(l.subArray(B, 3)));
		System.out.println(Arrays.toString(l.subArray(C, 1)));
		System.out.println(Arrays.toString(l.subArray(D, 4)));
		System.out.println(Arrays.toString(l.subArray(E, 3)));
	}
}
