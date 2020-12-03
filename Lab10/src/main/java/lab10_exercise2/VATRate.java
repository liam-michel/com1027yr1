package lab10_exercise2;

public enum VATRate {
	ZERO(0), LOW(0.05), STANDARD(0.175);

	private double vat;
	
	private VATRate(double vat) {
		this.vat=vat;
	}

	public double getVAT() {
		return this.vat;
	}
}
