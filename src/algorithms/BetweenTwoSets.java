package algorithms;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(4);
		
		List<Integer> b = new ArrayList<Integer>();
		b.add(16);
		b.add(32);
		b.add(96);
		
		System.out.println(getTotalX(a, b));
	}
	public static int getTotalX(List<Integer> a, List<Integer> b) {
	    int count = 0;
	    int lcmOfListOne = getLCMOfList(a);
	    int gcdOfListTwo = getGCDofList(b);
	    int i = 1;
	    while(lcmOfListOne*i <= gcdOfListTwo) {
	    	if(gcdOfListTwo%(lcmOfListOne*i) == 0) {
	    		count++;
	    	}
	    	i++;
	    }
		return count;
	}
	
	public static int getLCMOfList(List<Integer> a) {
		int lcm = a.get(0);
		for(int element: a) {
			lcm = getLCM(lcm, element);
		}
		return lcm;
	}
	
	public static int getLCM(int a, int b) {
		if(a == 0 || b == 0) {
			return 0;
		} else {
			if (a == b)
				return a;
			else {
				if(a > b) {
					if(a%b == 0) {
						return a;
					} else {
						int i = 2;
						while(true) {
							if((a*i)%b == 0)
								return a*i;
							else 
								i++;
						}
					}
				} else {
					return getLCM(b, a);
				}
			}
		}
	}
	
	public static int getGCD(int a, int b) {
		if(a == b)
			return a;
		else 
			if(a > b) {
			for(int i = b; i > 0; i--) {
				if(b%i == 0 && a%i == 0)
					return i;
			}
		}else 
			return getGCD(b, a);
		return 1;
	}
	
	public static int getGCDofList(List<Integer> a) {
		int gcd = a.get(0);
		for(int element: a) {
			gcd = getGCD(gcd, element);
		}
		return gcd;
	}
}
