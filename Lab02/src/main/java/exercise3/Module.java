package exercise3;

public class Module {
	
	private Assessment assessment1;
	private Assessment assessment2;
	
	public Module(Assessment assessment1, Assessment assessment2) {
		this.assessment1=assessment1;
		this.assessment2=assessment2;
		
	}
	
	public double calculateAverage() {
		return 100*(((this.assessment1.getMark()*0.2)/this.assessment1.getMaximum())+((this.assessment2.getMark()*0.8)/this.assessment2.getMaximum()));
	}

	@Override
	public String toString() {
		return "COM1027 Average = " + this.calculateAverage()+ "% [Labs(20%) = " + this.assessment1.getMark()+"% ,Coursework(80%) = " + this.assessment2.getMark()+"% ]";
	}
	
	
	
	
}
