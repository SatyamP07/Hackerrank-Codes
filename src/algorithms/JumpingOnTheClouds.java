package algorithms;

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		int[] c = {0, 0, 1, 0, 0, 1, 1, 0};
		System.out.println(jumpingOnClouds(c, 2));
	}
	static int jumpingOnClouds(int[] c, int k) {
        int count = 0, energy = 100, zeroCount = 0;
        while(true) {
        	 if(zeroCount == 1){
                 break;
             }
            if(c[count] == 1) {
                energy = energy - 3;
            } else {
                energy--;
            }
           
            count = ((count + k) % c.length);
            if(count == 0){
                zeroCount++;
            }
        }
        return energy;
    }
}
