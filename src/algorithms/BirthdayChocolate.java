package algorithms;

import java.util.List;

public class BirthdayChocolate {

	static int birthday(List<Integer> s, int d, int m) {
		int count =0;
		int sum;
		for(int i = 0; i < (s.size() - m); i++) {
			sum = 0;
			for(int j = 0; j < m; j++) {
				sum += s.get(i+j);
			}
			if(sum == d)
				count++;
		}
		return count;
    }
}
