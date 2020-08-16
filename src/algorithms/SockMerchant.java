package algorithms;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
	
	public static void main(String[] args) {
		int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
		int n = 10;
		System.out.println(sockMerchant(n, ar));
	}
	
	static int sockMerchant(int n, int[] ar) {
        int count = 0;
        Map<Integer, Integer> pairMap = new HashMap<Integer, Integer>();
        for(int a: ar) {
            if(pairMap.containsKey(a)) {
            	pairMap.put(a, pairMap.get(a) + 1);
            } else {
            	pairMap.put(a, 1);
            }
        }
        for(Map.Entry<Integer, Integer> me: pairMap.entrySet()) {
        	count = count + (me.getValue() / 2);
        }
        return count;
    }
}
