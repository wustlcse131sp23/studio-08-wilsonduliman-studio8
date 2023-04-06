package studio8;

import java.util.Objects;

public class Appointment {
	public Date date;
	public Time time;
	public String name;
	
	public Appointment(String initName, Date initDate, Time initTime) {
		date = initDate;
		time = initTime;
		name = initName;
	}

	
	public static void main(String[] args) {
		
		Date a1 = new Date("March", 26, 2003);
		Time b1 = new Time(1,34,false);
		String doc = "doc";
		Date c1 = new Date("March", 26, 2003);
		Time d1 = new Time(1,34,false);
		String dinner = "dinner";
		
		
		Appointment a = new Appointment(doc,a1,b1);
		Appointment b = new Appointment(dinner,c1,d1);
		
		// TODO Auto-generated method stub

	}


	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

}
