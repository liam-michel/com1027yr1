package lab8_exercise1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Counting {
	
	public Counting() {
		super();
	}
	
	public String readTextFile() {
		int counter = 0;
		BufferedReader buffer = null;
		String returnstring="";
		
		try {
			FileReader in = new FileReader("words.txt");
			buffer = new BufferedReader(in);
			
			String line = buffer.readLine();
			while(line!=null) {
				counter++;
				returnstring+=displayLine(line,counter);
				line=buffer.readLine();
			}
		}catch(FileNotFoundException e) {
			System.out.println("File could not be found");
		}catch(IOException e) {
			System.out.println("There was a problem reading from the file");
		}finally {
			if (buffer!=null) { //This means that we have managed to read from the file
				try {
					buffer.close();
				
				}catch(IOException e) {
					System.out.println("Could not close the file");
				}
			}
		
			
		}
		
		return returnstring;
		
	}
	
	private String displayLine(String line, int counter) {
		return (line+" : "+counter+"\n");
	}
	

}
