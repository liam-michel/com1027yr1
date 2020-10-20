package lab4_exercise2;

public class Day {
	private String name ;
	Session[] sessions;
	
	public Day(String name) {
		this.name=name;
		this.sessions = new Session[4];
	}
	public void setSession(int index, String moduleName, int startTime, int endTime) {
		this.sessions[index]= new Session();
		this.sessions[index].setSessionName(moduleName);
		this.sessions[index].setStartTime(startTime);
		this.sessions[index].setEndTime(endTime);
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		
		String returnString="";
		
		for (int index=0;index<this.sessions.length;index++) {
			if (this.sessions[index]!=null){
				String session = this.sessions[index].getSessionName();
				int sessionstart = this.sessions[index].getStartTime();
				int sessionend=this.sessions[index].getEndTime();
				
				returnString+=(session+": "+sessionstart+" - "+sessionend+"\n");
			}
		}
		return returnString;
	}
	
	public void display() {
		System.out.println(this.toString());
		
	}
	
	
}