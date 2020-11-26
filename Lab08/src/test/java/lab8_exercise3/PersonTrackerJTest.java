package lab8_exercise3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTrackerJTest {

	PersonTracker pTracker = new PersonTracker();

	@Test
	public void lab8_testEmpty() {
		assertEquals("", pTracker.displayList());
	}

	@Test
	public void lab8_testReadTextFile() {
		pTracker.readTextFile("names.txt");
		assertEquals("Joe Bloggs (18)\n" + 
				"Sid James (45)\n" + 
				"Bobby Ewing (93)\n" + 
				"Incredible Hulk (65)\n" + 
				"Bart Simpson (13)\n" + 
				"", pTracker.displayList());
	}
	
	@Test
	public void lab8_testReadSecondTextFile() {
		pTracker.readTextFile("party.txt");
		assertEquals("Joe Bloggs (18)\n" + 
				"Sid James (54)\n" + 
				"Bobby Ewing (93)\n" + 
				"Incredible Hulk (65)\n" + 
				"Bart Simpson (18)\n" + 
				"Stella Kazamia (40)\n" + 
				"Zhenhua Feng (38)\n" + 
				"Bob Ross (25)\n" + 
				"Alice Wonderland (31)\n" + 
				"", pTracker.displayList());
	}

}
