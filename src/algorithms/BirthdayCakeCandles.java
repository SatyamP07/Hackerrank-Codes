package algorithms;

import java.util.Arrays;

public class BirthdayCakeCandles {
	public static void main(String[] args) {
		int ar[] = new int[100000];
		for(int a: ar)
			a = 9999999;
		System.out.println(birthdayCakeCandles(ar));
	}
	
	static int birthdayCakeCandles(int[] ar) {
		Arrays.sort(ar);
		int count = 1;
		for(int i = ar.length -1; i > 0; i--) {
			if(ar[i] == ar[i-1])
				count++;
			else
				break;
		}
		return count;
    }
}
