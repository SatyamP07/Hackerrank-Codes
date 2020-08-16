package algorithms;

import java.util.HashMap;
import java.util.Map;

public class EqualizeTheArray {
	
	static int equalizeArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++){
            if(numberMap.containsKey(arr[i])) {
            	numberMap.put(arr[i], numberMap.get(arr[i]) + 1);
            } else {
            	numberMap.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: numberMap.entrySet()) {
        	if(max < entry.getValue())
        		max = entry.getValue();
        }
        
        return arr.length-max;
    }
}
