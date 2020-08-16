package algorithms;

public class ModifiedKaprekarNumber {

	public static void main(String[] args) {
		kaprekarNumbers(1, 99999);
	}
	static void kaprekarNumbers(int p, int q) {
        int mid, newNumber, count = 0;
        long square;
        for(int i = p; i <= q; i++) {
            square = i*i;
            String s = "" + square;
            mid = s.length()/2;
            if(s.length() > 1)
            	newNumber = Integer.parseInt(s.substring(0, mid)) + Integer.parseInt(s.substring(mid));
            else
            	newNumber = Integer.parseInt(s);
            if(newNumber == i) {
                System.out.print(i + " ");
                count++;
            }
        }
        if(count == 0)
        	System.out.println("INVALID RANGE");
    }
}
