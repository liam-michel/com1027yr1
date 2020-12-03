package lab10_exercise3;

public class Charge {
	private Service service;
	private double charge;
	
	public Charge(Service service, double charge) {
		this.service=service;
		this.charge=charge;
	}
	
	public Service getService() {
		return this.service;
	}
	
	public double getCharge() {
		return this.charge;
	}
	
	
	//multiplies the VATRate of the service by the charge
	public double calculateVAT() {
		return (service.getRate().getVAT() * getCharge());
	}
}
