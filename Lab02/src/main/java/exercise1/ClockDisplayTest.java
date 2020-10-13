package exercise1;
public class ClockDisplayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClockDisplay clock12 = new ClockDisplay(true);
		ClockDisplay clock24 = new ClockDisplay(false);
		
		for (int i=0; i<821; i++) {
			clock12.timeTick();
			System.out.println(clock12.toString());
			
		}

	}

}
