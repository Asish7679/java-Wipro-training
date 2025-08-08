package class23_7;

public class Emp_Main {
	    public static void main(String[] args) {
	        Manager m = new Manager();
	        m.name = "Asish";
	        m.salary = 1000;
	        m.details();
	        m.role();

	        System.out.println();

	        dev d = new dev();
	        d.name = "Rahul";
	        d.salary = 1500;
	        d.details();
	        d.role();
	    }
	}

