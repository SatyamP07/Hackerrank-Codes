package algorithms;

public class CountingValleys {

	public static void main(String[] args) {
		int n = 8;
		String s = "UDDDUDUU";
		System.out.println(countingValleys(n, s));
	}
	
	static int countingValleys(int n, String s) {
        int valleyCount = 0, curAltitude = 0, preAltitude = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == 'D') {
                curAltitude-- ;
                if(preAltitude == 0 && curAltitude < 0)
                    valleyCount++;
            } else {
                curAltitude++;
            }
        	preAltitude = curAltitude;
        }
        return valleyCount;
    }
}
