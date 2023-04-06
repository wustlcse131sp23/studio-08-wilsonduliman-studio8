package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean is24display;
	
	
	public Time (int inithour, int initminute, boolean initis24display) {
		hour = inithour;
		minute = initminute;
		is24display = initis24display;
	}

	public String toString() {
		 if (is24display == false){
			if (hour > 12) {
				hour = hour - 12;
			}
		 }
		String displayHour = Integer.toString(hour);
		String displayMinute  = Integer.toString(minute);
		return displayHour + ":"+ displayMinute;
		
	}

	public static void main(String[] args) {
		Time test = new Time(1,25,false);
		Time test2 = new Time(14,25,false);
		
		System.out.println(test);
		System.out.println(test2);
 
    	Time a = new Time(1,25,false);
    	Time b = new Time(14,25,false);
		Time c = new Time (14,25,true);
		Time d = new Time (2,25,false);
		
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(b.equals(d));
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

}