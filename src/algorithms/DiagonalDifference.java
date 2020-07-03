package algorithms;

import java.util.List;

public class DiagonalDifference {
	public static int diagonalDifference(List<List<Integer>> arr) {
	    int primaryDiagonal = 0;
	    int secondaryDiagonal = 0;
		for(int i = 0; i < arr.size(); i++) {
	       for(int j = 0; j < arr.size(); j++) {
	    	   if(i == j )
	    		   primaryDiagonal += arr.get(i).get(j);
	    	   if((i + j) == (arr.size() - 1) )
	    		   secondaryDiagonal += arr.get(i).get(j);
	       }
	    }
	    return Math.abs(primaryDiagonal - secondaryDiagonal);
    }
}
