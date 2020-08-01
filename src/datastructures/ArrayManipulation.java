package datastructures;

import java.io.*;
import java.util.*;

public class ArrayManipulation {
	
//	public static void main(String[] args) {
//		int n = 5;
//		int[][] queries = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
//		arrayManipulation(n, queries);
//	}
//	static long arrayManipulation(int n, int[][] queries) {
//		long[] arr = new long[n];
//		long max = Long.MIN_VALUE;
//		for(int i = 0; i < queries.length; i++) {
//			for(int j = queries[i][0] - 1; j < queries[i][1]; j++) {
//				arr[j] += queries[i][2];
//				if(max < arr[j])
//					max = arr[j];
//			}
//		}
//		return max;
//    }
	
	public static void main(String[] args) throws IOException{
		int n, m, a, b, k;
		long max = Long.MIN_VALUE;
		BufferedReader br = new BufferedReader( 
                new InputStreamReader(System.in)); 
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st1.nextToken());
		long[] arr = new long[n];
		m = Integer.parseInt(st1.nextToken());
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			for(int j = a-1; j < b; j++) {
				arr[j] += k;
				if(max < arr[j])
					max = arr[j];
			}
		}
		System.out.println(max);
	}
}
