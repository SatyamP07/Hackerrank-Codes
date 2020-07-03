package algorithms;

import java.util.List;

public class MigratoryBirds {
	static int migratoryBirds(List<Integer> arr) {
		int min = Integer.MAX_VALUE;
		int maxCount = Integer.MIN_VALUE;
		int[] countArray = new int[5];
		for(int a: arr)
			countArray[a-1]++;
		for(int i = 0; i < countArray.length; i++) {
			if(countArray[i] > maxCount) {
				maxCount = countArray[i];
				min = i;
			}
		}
		return (min + 1);
    }
}
