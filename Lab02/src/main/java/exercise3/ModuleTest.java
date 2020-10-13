package exercise3;

public class ModuleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assessment Labs = new Assessment("Mark",90);
		Assessment Coursework = new Assessment("Mark",72);
		Module mymodule = new Module(Labs,Coursework);
		System.out.println(mymodule.toString());
		

	}

}
