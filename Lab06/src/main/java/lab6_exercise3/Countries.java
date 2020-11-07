package lab6_exercise3;

public enum Countries {
	BRITAIN(0,true), CANADA(1,false), CHINA(2,false), RUSSIA(3,false), FRANCE(4,true);

	private int index;
	private boolean inEU;
		
	private Countries(int index, boolean inEU) {
		this.index=index;
		this.inEU=inEU;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public boolean isEU() {
		return this.inEU;
	}
	
	public static Countries[] orderedCountires() {
		Countries[] output = new Countries[Countries.values().length];
		for(Countries country: Countries.values()) {
			output[country.getIndex()] = country;
			
		}
		
		return output;
	}
}
