package algorithms;

public class TimeConversion {
	public static void main(String[] args) {
		String s = "12:45:54PM";
		System.out.println(timeConversion(s));
	}
	
	static String timeConversion(String s) {
        String domain = s.substring(8);
        if(domain.equalsIgnoreCase("PM")) {
        	String dayClock = s.substring(0, 8);
        	String hours;
        	if(Integer.parseInt(s.substring(0,2)) !=12)
        		hours = "" + (Integer.parseInt(s.substring(0,2)) + 12);
        	else
        		hours = "" + (Integer.parseInt(s.substring(0,2)));
        	if( hours.equals("24"))
        		hours = "00";
        	return hours + dayClock.substring(2);
        }
        String hours;
        if(Integer.parseInt(s.substring(0,2)) > 10)
        	hours = "" + Integer.parseInt(s.substring(0,2));
        else
        	hours = "0" + Integer.parseInt(s.substring(0,2));
        if( hours.equals("12"))
    		hours = "00";
		return hours + s.substring(2,8);
    }
}
