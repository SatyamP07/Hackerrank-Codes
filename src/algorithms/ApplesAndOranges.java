package algorithms;

public class ApplesAndOranges {
	
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int apple = 0, orange = 0;
		for(int ap: apples) {
			if((a + ap) >= s && (a + ap) <= t)
				apple++;
		}
		for(int o: oranges) {
			if((b + o) >= s && (b + o) <= t)
				orange++;
		}
		System.out.println(apple);
		System.out.println(orange);
    }
}
