package class23_7;

public class emp_bank {
	    private double salary;
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	        if (salary > 0) {
	            this.salary = salary;
	        } else {
	            System.out.println("Salary must be positive.");
	        }
	    }
	}

