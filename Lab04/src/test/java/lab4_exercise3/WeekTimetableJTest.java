package lab4_exercise3;
/**
 * @author Stella Kazamia
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeekTimetableJTest {
	@Test
	public void lab4_testSetSessionPicture() {
		Day d = new Day("Monday");
		d.setSession(0, "COM1027", 9, 10);
		d.setSession(1, "COM1025", 15, 17);

		assertEquals("COM1027: 9 - 10\n" + "COM1025: 15 - 17\n", d.toString());

		Day d2 = new Day("Tuesday");
		d2.setSession(0, "COM1026", 13, 15);

		assertEquals("COM1026: 13 - 15\n", d2.toString());

	}

	@Test
	public void lab4_testTimetable() {
		WeekTimetable timetable = new WeekTimetable();

		Day d = new Day("Monday");
		d.setSession(0, "COM1027", 9, 10);
		d.setSession(1, "COM1025", 15, 17);

		Day d2 = new Day("Tuesday");
		d2.setSession(0, "COM1026", 13, 15);

		Day d3 = new Day("Wednesday");
		d3.setSession(0, "Sport", 13, 18);

		Day d4 = new Day("Thursday");
		d4.setSession(0, "Spanish Language Lessons", 9, 11);
		d4.setSession(1, "COM1027", 11, 13);

		Day d5 = new Day("Friday");

		timetable.addDailySessions(0, d);
		timetable.addDailySessions(1, d2);
		timetable.addDailySessions(2, d3);
		timetable.addDailySessions(3, d4);
		timetable.addDailySessions(4, d5);

		assertEquals(
				"Monday\n" + "COM1027: 9 - 10\n" + "COM1025: 15 - 17\n" + "\n" + "Tuesday\n" + "COM1026: 13 - 15\n"
						+ "\n" + "Wednesday\n" + "Sport: 13 - 18\n" + "\n" + "Thursday\n"
						+ "Spanish Language Lessons: 9 - 11\n" + "COM1027: 11 - 13\n" + "\n" + "Friday\n" + "\n" + "",
				timetable.printTimetable());

		System.out.println(timetable.printTimetable());
	}
	
	@Test
	public void lab4_testSecondTimetable() {
		WeekTimetable timetable = new WeekTimetable();

		Day d = new Day("Monday");
		d.setSession(0, "COM1027", 9, 10);

		Day d2 = new Day("Tuesday");
		d2.setSession(0, "COM1026", 13, 15);

		Day d3 = new Day("Wednesday");
		d3.setSession(0, "Sport", 13, 18);

		Day d4 = new Day("Thursday");
		d4.setSession(0, "Spanish Language Lessons", 9, 11);

		Day d5 = new Day("Friday");
		d5.setSession(0, "Spanish Language Lessons", 9, 11);
		d5.setSession(1, "COM1025", 11, 13);
		d5.setSession(2, "MAN1067", 16, 18);


		
		timetable.addDailySessions(0, d);
		timetable.addDailySessions(1, d2);
		timetable.addDailySessions(2, d3);
		timetable.addDailySessions(3, d4);
		timetable.addDailySessions(4, d5);

		assertEquals("Monday\n" + 
				"COM1027: 9 - 10\n" + 
				"\n" + 
				"Tuesday\n" + 
				"COM1026: 13 - 15\n" + 
				"\n" + 
				"Wednesday\n" + 
				"Sport: 13 - 18\n" + 
				"\n" + 
				"Thursday\n" + 
				"Spanish Language Lessons: 9 - 11\n" + 
				"\n" + 
				"Friday\n" + 
				"Spanish Language Lessons: 9 - 11\n" + 
				"COM1025: 11 - 13\n" + 
				"MAN1067: 16 - 18\n" + 
				"\n" 
				, timetable.printTimetable());

		System.out.println(timetable.printTimetable());
	}
}
