package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private String month;
	private int day;
	private int year;
	private boolean isholiday;
	
	public Date(String initmonth, int initday, int inityear) {
		month = initmonth;
		day = initday;
		year = inityear;	
	}

	public String toString() {
		String displayDate = Integer.toString(day);
		String displayYear = Integer.toString(year);
		return month + " " + displayDate + ", " + displayYear;
	}


    public static void main(String[] args) {
    	Date test = new Date("April", 6,2023);
    	Date test2 = new Date("August", 7,1989);
    	System.out.println(test);
    	System.out.println(test2);
    	
    	Date a = new Date("April", 6,2023);
    	Date b = new Date("August", 7,1989);
    	Date c = new Date("June", 7,1989);
    	Date d = new Date("December", 25, 2004);
    	Date e = new Date("October", 14, 1995);
    	Date f = new Date("August", 7,1989);
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(a);
    	list.add(b);
    	list.add(c);
    	list.add(d);
    	list.add(e);
    	list.add(f);
    	list.add(b);
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(a);
    	set.add(b);
    	set.add(c);
    	set.add(d);
    	set.add(e);
    	set.add(f);
    	set.add(b);
     	System.out.println(set);
    	
    
    	System.out.println(a.equals(b));
    	System.out.println(b.equals(c));
    
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && Objects.equals(month, other.month) && year == other.year;
	}

}
