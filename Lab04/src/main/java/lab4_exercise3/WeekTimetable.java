package lab4_exercise3;

public class WeekTimetable {
	Day[] days;
	
	public WeekTimetable() {
		this.days= new Day[5];
	}
	
	public void addDailySessions(int index, Day day) {
		this.days[index]=day;
	}
	public String printTimetable() {
		String returnString="";
		for (int i=0; i<this.days.length; i++) {
			if (this.days[i]!=null){
				returnString+=this.days[i].getName()+"\n";
				returnString+=this.days[i].toString()+"\n";
				
				
			}
		}
		return returnString;
	}

}
