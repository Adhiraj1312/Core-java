package sorting;

public class Student {

	private int Rollno;
	private String name ;
	private int marks;
	
	
	
	public Student(int Rollno , String name , int marks) {
		
		this.Rollno = Rollno;
		this.name = name;
		this.marks = marks;
		
		}
	
	public String toString() {
		return "ROllno: " + Rollno + "Name: " + name + "Marks: " + marks;
	}
	
}
