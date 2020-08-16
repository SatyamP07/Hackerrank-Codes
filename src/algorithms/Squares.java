package algorithms;

public class Squares {

	public static void main(String[] args) {
		System.out.println(squares(4, 10));
	}
	static int squares(int a, int b) {
		System.out.println((int)Math.floor(Math.sqrt(b)));
		System.out.println((int)Math.ceil(Math.sqrt(a)));
        return ((int)Math.floor(Math.sqrt(b)) - (int)Math.ceil(Math.sqrt(a)));
    }
}
