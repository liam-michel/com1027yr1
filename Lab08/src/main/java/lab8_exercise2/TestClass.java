package lab8_exercise2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader buffer = null;
		String returnstring="";
		String filename="party.txt";
		try {
			FileReader reader = new FileReader(filename);
			buffer = new BufferedReader(reader);
			
			String line = buffer.readLine();
			while(line!=null) {
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
	
	

}
