package algorithms;

public class Kangaroo {
	static String kangaroo(int x1, int v1, int x2, int v2) {
		boolean flag = false;
		int difference = 0;
		if(x1 > x2) {
			difference = x1 - x2;
			while(x1 > x2 || !flag )  {
				if( x1 == x2) {
					flag = true;
					break;
				}
				x1 += v1;
				x2 += v2;
				if(difference <= (x1 - x2)) {
					break;
				}
			}
		} else {
			difference = x2 - x1;
			while(x2 > x1 || !flag )  {
				if( x1 == x2) {
					flag = true;
					break;
				}
				x1 += v1;
				x2 += v2;
				if(difference <= (x2 - x1)) {
					break;
				}
			}
		}
		if (flag)
			return "YES";
		else
			return "NO";
    }
}
