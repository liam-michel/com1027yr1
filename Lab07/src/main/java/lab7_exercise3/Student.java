package lab7_exercise3;

import java.util.List;
import java.util.ArrayList;  




public class Student {
	
	private String name;
	private int urn;
	private List<Module> moduleList;
	
	public Student(String name, int urn) {
		this.name=name;
		this.urn=urn;
		this.moduleList= new ArrayList<Module>();
		
	}
	
	public int getUrn() {
		return this.urn;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addModuleList(Module module) {
		boolean inList = this.moduleList.contains(module);
		if (!inList) {
			this.moduleList.add(module);   }	
	}
	
	public String printModules() {
		StringBuffer buffer = new StringBuffer();
		for (Module module: this.moduleList) {
			buffer.append(module.getName()+", ");
		}
		
		String returnstring = buffer.substring(0,(buffer.length()-2)); // This line cuts off the two last letters on the buffer
		returnstring+=" ";  //The JUnit test wants a " " on the end, so we replace the last two letters (which would be ", ") with just a " "
		return returnstring;
	
		}
	
	
	
	}
		
	
	
	
	
	

