import java.util.*;
public class Main{
	public static void main(String[] args) {
		String time="03:20:56 PM";

		int hour=Integer.parseInt(time.substring(0,2));
		int minute=Integer.parseInt(time.substring(3,5));
		int second=Integer.parseInt(time.substring(6,8));

		String meridian=time.substring(9,11);

		hour-=(meridian.equals("AM") && hour==12)?12:0;
		hour+=(meridian.equals("PM") && hour!=12) ?12:0;

		System.out.println(String.format("%02d",hour)+":"+String.format("%02d",minute)+":"+String.format("%02d",second));
	}
}