package algorithms;

import java.util.ArrayList;
import java.util.List;

public class GaminArray {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(5);
		list.add(2);
		list.add(6);
		list.add(3);
		list.add(4);
		System.out.println(gamingArray(list));
	}	
	
	public static String gamingArray(List<Integer> arr) {
	    int turns = 0;
		while(!arr.isEmpty()) {
			List<Integer> copy = new ArrayList<Integer>(playTurn(arr));
			arr.clear();
			arr.addAll(copy);
			copy.clear();
			turns++;
		}
		return (turns % 2 == 0) ? "ANDY": "BOB";
	}
	
	public static List<Integer> playTurn(List<Integer> arr) {
		int index = maxIndex(arr);
		for(int i = index; arr.size()> i;) {
			arr.remove(i);
		}
		return arr;
	}
	
	public static int maxIndex(List<Integer> list) {
		Integer i=0, maxIndex=-1, max = Integer.MIN_VALUE;
		  for (Integer x : list) {
		    if ((x!=null) && ((max==null) || (x>max))) {
		      max = x;
		      maxIndex = i;
		    }
		    i++;
		  }
		  return maxIndex;
		}
}
