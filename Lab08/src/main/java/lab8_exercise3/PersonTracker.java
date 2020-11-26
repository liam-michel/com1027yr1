package lab8_exercise3;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;


public class PersonTracker {
	
	private List<Person> peopleList;
	
	public PersonTracker() {
		this.peopleList = new ArrayList<Person>();
	}
	
	public String displayList() {
		String returnstring="";
		for (Person person: this.peopleList) {
			returnstring+=(person.toString()+'\n');
			
		}
		
		return returnstring;
	}
	
	public void readTextFile(String filename) {
		BufferedReader buffer = null;
		String returnstring="";
		try {
			FileReader reader = new FileReader(filename);
			buffer = new BufferedReader(reader);
			
			String line = buffer.readLine();
			while(line!=null) {
				this.breakLine(line);
				returnstring+=(line+"\n");
				line=buffer.readLine();
			}
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
			
		}catch(IOException e) {
			System.out.println("There was a problem with reading from this text file");
			
		}finally {
			if (buffer!=null) {
				try {
					buffer.close();
				}catch(IOException e) {
					System.out.println("Could not close file");
				}
			}
		}
		System.out.println(returnstring);
	}
	
	private void breakLine(String line) {
		StringTokenizer tokens = new StringTokenizer(line);
		String fname=tokens.nextToken();
		String sname=tokens.nextToken();
		int age=Integer.parseInt(tokens.nextToken());
		this.addPerson(fname, sname, age);
	
	}
	
	private void addPerson(String forename, String surname, int age) {
		try {
			Person person = new Person(forename,surname,age);
			this.peopleList.add(person);
		}catch(InvalidSurnameException e) {
			System.out.println("Invalid Surname entered");
		}catch(InvalidAgeException e) {
			System.out.println("Invalid age entered");
		}
		
	}
	
}

