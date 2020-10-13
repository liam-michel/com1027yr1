package lab2;
public class ClockDisplayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClockDisplay clock = new ClockDisplay();
		
		for (int i=0; i<1000; i++) {
			clock.timeTick();
			System.out.println(clock.toString());
			
		}

	}

}
