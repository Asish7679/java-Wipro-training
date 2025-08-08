package class25_7;

public class SortLam {
	    public static void main(String[] args) {
	        prac[] employees = {
	            new prac("Asish", 50000),
	            new prac("Nikita", 75000),
	            new prac("Ravi", 40000),
	            new prac("Priya", 90000)
	        };

	        for (int i = 0; i < employees.length - 1; i++) {
	            for (int j = 0; j < employees.length - i - 1; j++) {
	                if (employees[j].salary > employees[j + 1].salary) {
	                    prac temp = employees[j];
	                    employees[j] = employees[j + 1];
	                    employees[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("Employees sorted by salary (Low to High):");
	        for (prac emp : employees) {
	            System.out.println(emp);
	        }
	    }
	}

