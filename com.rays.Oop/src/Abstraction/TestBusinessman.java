package Abstraction;

public class TestBusinessman {

	public static void main(String[] args) {
		
		richman r = new businessman();   //if want to print only  form Rich man we use this object
		
		socialworker s = new businessman();   // if want to print only  form social worker we use this object
		
		businessman b =  new businessman();   // if want to form both rich man and  social worker we use this object
		
		
		
		System.out.println("--------------object r---------------------");
		
		
		r.earnmoney();
		r.donation();
		r.party();
		
		System.out.println("---------------object s-----------------");
		
		s.helptoOthers();
		s.charity();
		
		System.out.println("--------------Object b-----------------");
		
		b.charity();
		b.donation();
		b.earnmoney();
		b.party();
		b.helptoOthers();
		b.setName("Yash");
		b.setAddress("indore");
		
		System.out.println("Name of Business man : " + b.getName());
		
		System.out.println("Address of the business man : " + b.getAddress());
	}
}
