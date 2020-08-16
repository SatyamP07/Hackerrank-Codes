package algorithms;

public class HalloweenSale {

	public static void main(String[] args) {
		System.out.println(howManyGames(100, 19, 1, 180));
	}
	static int howManyGames(int p, int d, int m, int s) {
        int count = 0, exp = 0;
        while(exp <= (s - m)) {
            exp = exp + p;
            count++;
            p = p - d;
            if(p < m)
                p = m;
        }
        return count;
    }
}
