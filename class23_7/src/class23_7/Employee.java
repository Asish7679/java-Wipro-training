package class23_7;

public class Employee {
	String name;
	int salary;
       void details() {  	   
    	   System.out.println("Name :"+name);
    	   System.out.println("Salary:"+salary);
       }
}
class Manager extends Employee{
	void role() {
		System.out.println("Role : Manager");
	}
       
}
class dev extends Employee{
	void role(){
		System.out.println("Role: Developer");
	}
}
