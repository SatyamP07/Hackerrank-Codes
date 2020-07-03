package algorithms;

import java.util.Arrays;

public class MinMax {
	
	public static void main(String[] args) {
		int arr[] = {3, 1, 1, 4, 1};
		miniMaxSum(arr);
	}
	
	static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        int min = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
        	if(i == 0)
        		min += arr[i];
        	else if (i == arr.length - 1)
        		max += arr[i];
        		else {
        			min += arr[i];
        			max += arr[i];
        		}
        }
        System.out.println(min + " " + max);
    }
}
