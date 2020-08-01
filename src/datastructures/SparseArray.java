package datastructures;

public class SparseArray {
	
	static int[] matchingStrings(String[] strings, String[] queries) {
		int[] results = new int[queries.length];
		for(int i = 0; i < queries.length; i++) {
			for(int j = 0; j < strings.length; j++) {
				if(strings[j].compareTo(queries[i]) == 0)
					results[i]++;
			}
		}
		return results;
    }
}
