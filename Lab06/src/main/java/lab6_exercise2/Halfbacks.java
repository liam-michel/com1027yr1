package lab6_exercise2;

public class Halfbacks {
	private Player[] halfbacks;
	
	public Halfbacks() {
		this.halfbacks=new Player[2];
	}

	public void assignHalfback(Player halfback){
		switch (halfback.getPosition()) {
		case SCRUMHALF:
			this.halfbacks[0]=halfback;
			break;
		case FLYHALF:
			this.halfbacks[1]=halfback;
			break;
			
		}
	}
	
	
	public String displayElements() {
		StringBuffer buffer = new StringBuffer();
		for(int i=0; i<this.halfbacks.length;i++) {
			if(halfbacks[i]!=null) {
				buffer.append(i+" - "+halfbacks[i].getName()+" "+halfbacks[i].getPosition()+"\n");
			}else {
				buffer.append(i+" - \n");
				
			}
		}
		return buffer.toString();
			
			
		}
		
			
	
	public String getPlayerBad(int number) {
		String result = null;
		if (number==0) {
			result=this.halfbacks[0].getName();
		}
		if(number==1) {
			result=this.halfbacks[1].getName();
		}
		return result;
		
	}
	
	public String getPlayer(RugbyPosition position) {
		String returnstring="";
		switch(position) {
		case SCRUMHALF:
			returnstring+=(halfbacks[0].getName());
			break;
		case FLYHALF:
			returnstring+=(halfbacks[1].getName());
			break;
		default:
			return null;
		}
		return returnstring;
	}
	
}
