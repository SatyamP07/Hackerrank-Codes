package datastructures;

public class Arrays2D {
	public static void main(String[] args) {
		
	}
	
	static int hourglassSum(int[][] arr) {
		int max = Integer.MIN_VALUE;
		int sum;
		for(int i = 0; i < 4; i++) {
			sum = 0;
			for(int j = 1; j < 5; j++) {
				sum = arr[i][j-1] + arr[i][j] + arr[i][j+1] 
						+ arr[i+1][j] + arr[i+2][j-1] + arr[i+2][j] + arr[i+2][j+1];
				if(max < sum)
					max = sum;
			}
		}
		
		return max;
    }
}
