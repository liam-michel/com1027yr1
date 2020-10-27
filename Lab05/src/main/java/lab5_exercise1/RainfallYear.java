package lab5_exercise1;

public class RainfallYear {
	private int year;
	private double[] rainfall;
	
	public RainfallYear(int year) {
		this.year=year;
		this.rainfall = new double[12];
		
	}
	
	public static void main(String[] args) {
		RainfallYear myyear= new RainfallYear(2020);
		double[] data = new double[] { 69, 43, 56, 52, 55, 53, 48, 57, 64, 68, 71, 10 };
		myyear.enterData(data);
		System.out.println(myyear.getRainfallMonth("JANUARY"));
		
	}
	
	public double calculateMeanRainfall() {
		double sum = 0.00;
		for (double i: this.rainfall) {
			sum+=i;		
		}
		sum/=12;
		return sum;	
	}
	
	
	public double calculateHighestRainfall() {
		double highest=0;
		for (int i=0;i<this.rainfall.length;i++) {
			if (this.rainfall[i]>highest){
				highest=this.rainfall[i];	}
		}
		
		return highest;	
	}
	
	
	public void enterData(double[] array) {
		this.rainfall=array;
		
	}
	
	public double getRainfallMonth(String month) {
		double val = 0;
		String[] months= new String[] {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
		for (int i = 0;i<months.length;i++) {
			if (months[i]==month){
				val=this.rainfall[i];
				break;   }
		}
		
		return val;
	
		
	}
	
	public int getYear() {
		return this.year;
	}
	
	
}
