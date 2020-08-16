package algorithms;

public class DrawingBook {
	
	
	public static void main(String[] args) {
		System.out.println(pageCount(5, 1));
	}
	static int pageCount(int n, int p) {
		int count = 0;
		if(p % 2 == 0)
			count = (p/2);
		else 
			count = (p-1)/2;
		
		if(p % 2 == 0) {
			System.out.println("Here1");
			if(count > (n-p)/2)
				count = (n-p)/2;
		}
		else {
			System.out.println("Here");
			if(count > (n-p+1)/2) {
				System.out.println("Here");
				count = (n-p+1)/2; 
				}
		}
		return count;
    }
}
