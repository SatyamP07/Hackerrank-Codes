package algorithms;

import java.math.BigInteger;

public class ExtraLongFactorial {
	static void extraLongFactorials(int n) {
		BigInteger number = BigInteger.valueOf(1);
        for(int i=1;i<=n;i++){
            number = number.multiply(BigInteger.valueOf(i));
        }
        System.out.println(number);
	}
}
