package exercise1;
import java.text.DecimalFormat;

public class ClockDisplay {
	private NumberInfo hours;
	private NumberInfo minutes;
	private boolean twelvehour;
	private int counter = 0 ;
	public ClockDisplay(boolean twelvehour) {
		this.hours= new NumberInfo(24);
		this.minutes=new NumberInfo(60);
		this.twelvehour=twelvehour;
		
		
	}
	
	public void timeTick() {
		this.minutes.increment();
		
		if (minutes.getValue()==0) {
			this.hours.increment();
			counter+=1;

			
		
		
			
		}
	}

	@Override
	public String toString() {
		DecimalFormat hourstyle = new DecimalFormat("0");
		DecimalFormat minutestyle = new DecimalFormat("00");
		if (this.twelvehour){
			if (counter==12) {
				return(12+":"+minutestyle.format(this.minutes.getValue())+"pm");
			}
			else if(counter==24) {
				return "0:00am";
			}
			else if(counter>12) {
				return (hourstyle.format(this.hours.getValue()%12) + ":" + minutestyle.format(this.minutes.getValue())+"pm");}		
			else {
				return (hourstyle.format(this.hours.getValue()%12) + ":" + minutestyle.format(this.minutes.getValue())+"am");}
		}else {
			DecimalFormat style = new DecimalFormat("00");
			return (style.format(this.hours.getValue()) + ":" + style.format(this.minutes.getValue()));}
		}
}
		
		

	
		
	
	

		

	
	
	
	


