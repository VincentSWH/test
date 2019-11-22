package test;

import java.util.Arrays;

public class compare {
	public void printArray(int[] arr){
		System.out.println(Arrays.toString(arr));
		//System.out.println();
	}
	//compare strings
	public int[] compareStrings(String A, String B){
		String[] strsA = A.split(","), strsB = B.split(",");
		int lenA = strsA.length, lenB = strsB.length;
		int[] freqs = new int[11];
		int[] res = new int[lenB];
		for(String s : strsA){
			if(s.length() == 0) continue;
			int[] counts = new int[26];
			int minIdex = 26;
			for(char c : s.toCharArray()){
				++counts[c - 'a'];
				minIdex = Math.min(minIdex, c - 'a');
			}
			int freq = counts[minIdex];
			freqs[freq]++;
		}
		for(int i = 1; i < 11; i++){
			freqs[i] += freqs[i - 1];
		}
		for(int i = 0; i < lenB; i++){
			String s = strsB[i];
			int[] counts = new int[26];
			int minIdex = 26;
			for(char c : s.toCharArray()){
				++counts[c - 'a'];
				minIdex = Math.min(minIdex, c - 'a');
			}
			int freq = counts[minIdex];
			res[i] = (freq - 1 >= 0)? freqs[freq - 1] : 0;
		}
		return res;
	}
	public static void main(String[] args){
		compare com = new compare();
		String[] testA = {"abcd,aabc,bd"}, testB = {"aaa,aa"};
		for(int i = 0; i < testA.length; i++){
			com.printArray(com.compareStrings(testA[i], testB[i]));
		}
	}
}
