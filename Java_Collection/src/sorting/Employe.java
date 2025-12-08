package sorting;

public class Employe {
	
	private  int id ;
	private String name;
	private int salary;
	
	
	public Employe (int id , String name , int salary) {
		
		this.id = id ;
		this.name = name ;
		this.salary = salary;
		
	}
	
	public String toString() {
		return " id: "+ id + "name: " + name + "salary: " + salary ;
		
	}
	
}
