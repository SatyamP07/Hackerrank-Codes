package algorithms;

public class TaumBday {
	public static void main(String[] args) {
		System.out.println(taumBday(27984, 1402, 619246, 615589, 247954));;
	}
	
	public static long taumBday(int b, int w, int bc, int wc, int z) {
        long sum = 0;
        if(bc < wc){
            if((bc + z) < wc){
                sum = b*bc + (bc + z)*w;
            } else {
                sum = b*bc + w*wc;
            }
        } else {
            if((wc + z) < bc)
                sum = b*(wc + z) + w*wc;
            else
                sum = b*bc + w*wc;
        }
        return sum;
    }
}
