package lab3_exercise3;

public class AnnualSalary {
	private double salary;
	
	public AnnualSalary() {
		this.salary=salary;
	}
	
	public double calculateTax() {
		double salary=this.salary;
		double taxable;
		double tax1=0.2;
		double tax2=0.4;
		
		if(salary<=12500) {
			return 0; }
;		taxable=salary-12509;
		if(taxable<=37500) {
			return taxable*tax1; }
		
		else {
			taxable-=37500;
			return taxable*0.4 + 7500; }
		
		}
	public double getSalary() {
		return this.salary;
		
	}
	public void setSalary(double salary) {
		this.salary=salary;
		
	}

}
