package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        List<Integer>[] seqList = new List[n];
        for (int n_i = 0; n_i < n; n_i++) {
            seqList[n_i] = new ArrayList<>();
        }
        int lastAnswer = 0;
        for (int i = 0; i < q; i++) {
            int t = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            List<Integer> sequence = seqList[(x^lastAnswer)%n];
            switch (t) {
                case 1:
                    sequence.add(y);
                    break;
                case 2:
                    lastAnswer = sequence.get(y%sequence.size());
                    System.out.println(lastAnswer);
                    break;
            }
        }
	}
	
	
}
