package exercise1;
import java.text.DecimalFormat;

public class ClockDisplay {
	private NumberInfo hours;
	private NumberInfo minutes;
	private boolean after12=false;
	private int counter=0;
	
	public ClockDisplay() {
		this.hours= new NumberInfo(24);
		this.minutes=new NumberInfo(60);
		
	}
	
	public void timeTick() {
		this.minutes.increment();
		
		if (minutes.getValue()==0) {
			this.hours.increment();
			counter++;
			if (counter==12) {
				after12=true;
			}
			
		
			
			
		}
	}

	@Override
	public String toString() {
		DecimalFormat style = new DecimalFormat("0");
		if (after12==false){
			return (style.format(this.hours.getValue()) + ":" + style.format(this.minutes.getValue())+"am"); }
		else {
			return (style.format(this.hours.getValue()) + ":" + style.format(this.minutes.getValue())+"pm"); }
		}
			
		
}
	
	
	
	


