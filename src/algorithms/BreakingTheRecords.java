package algorithms;

public class BreakingTheRecords {
	static int[] breakingRecords(int[] scores) {
		int max = 0, min = 0;
		int count[] = new int[2];
		for(int i = 0; i < scores.length; i++) {
			if(i == 0) {
				max = scores[i];
				min = scores[i];
			} else {
				if(scores[i] > max) {
					max = scores[i];
					count[0]++;
				}
				if(scores[i] < min) {
					min = scores[i];
					count[1]++;
				}
			}
		}
		return count;
    }
}
