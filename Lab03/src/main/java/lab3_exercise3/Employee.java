package lab3_exercise3;

public class Employee {
	private int id;
	private String forename;
	private String surname;
	private AnnualSalary salary;
	private Position companyPosition;
	
	public Employee(int id, String forename, String surname, AnnualSalary salary, Position companyPosition) {
		this.id=id;
		this.forename=forename;
		this.surname=surname;
		this.salary=salary;
		this.companyPosition=companyPosition;
		
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getForename() {
		return this.forename;
		
	}
	
	public String getSurname() {
		return this.surname;
		
	}
	
	public double getSalary() {
		return this.salary.getSalary();
	}
	
	public String getPositionName() {
		return this.companyPosition.getRoleName();
	}
	
	
	public void displayEmployeeName() {
		System.out.println(this.forename + " " + this.surname);
		
	}
	
	private boolean eligibleForBonus() {
		if (this.salary.getSalary()>=40000) {
			return true; }
		else {
			return false; }
		
		}
	
	public String toString() {
		if (this.eligibleForBonus()){
			return (this.getSurname()+", "+this.getForename()+" ("+this.getId()+"): "+this.companyPosition.getRoleName()+" at £"+this.getSalary()+" (£"+this.salary.calculateTax()+" tax) and is eligible for bonus.");}
		else {
			return (this.getSurname()+", "+this.getForename()+" ("+this.getId()+"): "+this.companyPosition.getRoleName()+" at £"+this.getSalary()+" (£"+this.salary.calculateTax()+" tax) and is not eligible for bonus.");}
			
	}
	
	
}
	
	
		
	
	


