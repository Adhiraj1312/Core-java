package serilazation;

import java.io.Serializable;

public class Account implements Serializable{

 public String accountNo;
 public transient double balance;
 
 
     public Account(String accountNo , double balance){
	 
	 this.accountNo = accountNo;
	 this.balance = balance;
	 
 }
 
 public String toStrinng() {
	 
	 return "accountNo" + accountNo + "balance" + balance;
 }
	
}
