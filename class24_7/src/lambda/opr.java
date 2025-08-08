package lambda;

public class opr {
	
	    public static void main(String[] args) {
	        
	        calc add = (a, b) -> a + b;
	        calc subtract = (a, b) -> a - b;
	        calc multiply = (a, b) -> a * b;
	        calc divide = (a, b) -> (b != 0) ? a / b : 0;

	        double x = 10;
	        double y = 5;

	        System.out.println("Addition: " + add.operation(x, y));
	        System.out.println("Subtraction: " + subtract.operation(x, y));
	        System.out.println("Multiplication: " + multiply.operation(x, y));
	        System.out.println("Division: " + divide.operation(x, y));
	    }
	}

