package lab7_exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentTracker {
	
	private List<Student> studentList;
	private Map<Integer,String> moduleList;

	public StudentTracker() {
		this.studentList= new ArrayList<Student>();
		
	}
	
	private void initialiseMap() {
		if (this.moduleList==null) {
			this.moduleList= new HashMap<Integer,String>();
		}
	}
	
	public String printStudents() {
		String returnstring="";
		for(Student student:this.studentList) {
			returnstring+=student.getName()+"("+student.getUrn()+")\n";	
		}
		
		return returnstring;
		
	}
	
	public void addStudent(Student student, List<Module> moduleList) {
		this.initialiseMap();
		for (Module module: moduleList) {
			student.addModuleList(module);
	
		}
		
		this.studentList.add(student);
		
		this.moduleList.put(student.getUrn(), student.printModules());

		
	}
	
	public String printModules(int urn) {
		this.initialiseMap();
		String returnstring = ("URN 23456 is enrolled in:\n"+this.moduleList.get(urn));
		return returnstring.substring(0,returnstring.length()-1);  //This returns up to the 2nd to last letter of the string, excluding the space that would have been there otherwise.
	}
	
	
	
	
	
	
	
	
}
