package lab10_exercise3;
import java.util.List;
import java.util.ArrayList;


public class Guest implements IGuest {
	
	private String forename;
	private String surname;
	private String address;
	private String telephone;
	private List<Charge> charges;
	
	public Guest(String forename, String surname, String address, String telephone) {
			this.forename=forename;
			this.surname=surname;
			this.address=address;
			this.telephone=telephone;
			this.charges = new ArrayList<Charge>();
			
	}
	
	public String getForename() {
		return this.forename;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getTelephone() {
		return this.telephone;
	}
	
	public List<Charge> getCharges(){
		return this.charges;
	}
	
	@Override
	public void addCharge(Service service, double charge) {
		Charge newcharge = new Charge(service, charge);
		this.charges.add(newcharge);
	}
	
	@Override
	public double calculateTotalChargeWithoutVAT() {
		double total = 0;
		for(Charge charge: this.charges) {
			total+=(charge.getCharge());
		}
		return total;
		
	}
	
	@Override
	public double calculateVATChargeAtRate(VATRate rate) {
		double total = 0;
		for(Charge charge: this.charges) {
			total+=(charge.getCharge()*rate.getVAT());
		}
		
		return total;
	}
	
	@Override
	public String toString() {
		return (this.getForename()+" "+this.getSurname()+", "+this.getAddress()+", "+this.getTelephone());
	}
}