package lab10_exercise2;

public class Service {
	
	private String code;
	private String name;
	private VATRate rate;
	private double standardCharge;
	
	public Service(String code, String name, VATRate rate, double standardCharge) {
		String regex = "([A-Z]{4}[0-9]{4})";
		boolean matchfound = code.matches(regex);
		if (!matchfound) {
			throw new IllegalArgumentException("Invalid Code");
		}
		if (name==null) {
			throw new NullPointerException("Null name entered");
		}
		if (standardCharge<=0) {
			throw new IllegalArgumentException("Invalid Standard Charge");
		}
		this.code=code;
		this.name=name;
		this.rate = rate;
		this.standardCharge= standardCharge;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public String getName() {
		return this.name;
	}
	
	public VATRate getRate() {
		return this.rate;
	}
		
	public double getStandardCharge() {
		return this.standardCharge;
	}
	

}
