package OA;

import java.util.Arrays;

public class oa1 {
	    public void printArray(int[] arr){
	    	System.out.println(Arrays.toString(arr));
	       // System.out.println();
	    }
	  //Compare Strings
	    public int[] compareStrings(String A, String B){
	        String[] strsA = A.split(","), strsB = B.split(",");
	        int lenA = strsA.length, lenB = strsB.length;
	        int[] freqs = new int[11];
	        int[] res = new int[lenB];
	        for(String s: strsA){
	            if(s.length() == 0) continue;
	            int[] counts = new int[26];
	            int minIdx = 26;
	            for(char c: s.toCharArray()){
	                ++counts[c - 'a'];
	                minIdx = Math.min(minIdx, c - 'a');
	            }
	            int freq = counts[minIdx];
	            freqs[freq]++;
	        }
	        // use prefix sum to easily get sum from idx 0 to i
	        for(int i = 1; i < 11; ++i)
	            freqs[i] += freqs[i - 1];
	        for(int i = 0; i < lenB; ++i){
	            String s = strsB[i];
	            int[] counts = new int[26];
	            int minIdx = 26;
	            for(char c: s.toCharArray()){
	                ++counts[c - 'a'];
	                minIdx = Math.min(minIdx, c - 'a');
	            }
	            int freq = counts[minIdx];
	            res[i] = (freq - 1 >= 0)? freqs[freq - 1]: 0;
	        }
	        return res;
	    }
	    public static void main(String[] args) {
	        oa1 main = new oa1();
	        //String[] testcasesA = {"abcd,aabc,bd"}, testcasesB = {"aaa,aa"};
	        String[] testcasesA = {"bbcd,ddd,bc"}, testcasesB = {"aaa,aa"};
	        for(int i = 0; i < testcasesA.length; ++i)
	            main.printArray(main.compareStrings(testcasesA[i], testcasesB[i]));
	    }
}
