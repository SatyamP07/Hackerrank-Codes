package algorithms;

public class BeautifulDays {

	public static void main(String[] args) {
		System.out.println(beautifulDays(20, 23, 6));
	}
	
	static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for(int a = i; a <= j; a++) {
            if(isBeautifulDay(a, k))
                count++;
        }
        return count;
    }

    static boolean isBeautifulDay(int a, int k) {
        int diff, revNumber = 0, number = a;
        while(a > 0) {
            revNumber = revNumber * 10;
            revNumber = revNumber + a % 10;
            a = a/10;
        }
        System.out.println("Number " + number + " RevNumber " + revNumber);
        if(Math.abs(number - revNumber) % k == 0)
            return true;
        else 
            return false;
    }
}
