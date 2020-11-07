package lab6_exercise3;

public class MedalTable {
	private int[][] medals;
	
	public MedalTable() {
		this.medals = new int[Countries.values().length][Medals.values().length];  
		//the above line makes a 2d array with the size of each dimension being determined by how many medals and countries there are
		
	}
	
	public void addMedal(Countries countries, Medals medals) {
		this.medals[countries.getIndex()][medals.getIndex()]+=1;
	}

	public int getMedals(Countries country, Medals medal) {
		return this.medals[country.getIndex()][medal.getIndex()];
		
	}
	
	public int getEUMedalCount() {
		int sum = 0;
		for(Countries country: Countries.values()) {
			for(int i=0; i<Medals.values().length-1;i++) {
				if(country.isEU()) {
					sum+=this.medals[country.getIndex()][i];   }
			}
		}
		return sum;
		
		
	}
		
}
