package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PickingNumbers {
	
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(4);
		a.add(6);
		a.add(5);
		a.add(3);
		a.add(3);
		a.add(1);
		System.out.println(pickingNumbers(a));
	}
	
	public static int pickingNumbers(List<Integer> a) {
		int[] freq = new int[100];
        for(int i = 0; i < a.size(); ++i)
        {
            freq[a.get(i)]++;
        }
        
        int curBest = 0;
        for(int i = 0; i < 99; ++i)
        {
            curBest = Math.max(curBest, freq[i]+freq[i+1]);
        }
		
		return curBest;
	}
}
