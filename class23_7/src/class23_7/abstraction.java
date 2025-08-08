package class23_7;

abstract class abstraction {
	
	    abstract double area();
	}

	class Circle extends abstraction {
	    double radius;

	    Circle(double radius) {
	        this.radius = radius;
	    }

	    double area() {
	        return Math.PI * radius * radius;
	    }
	}

	class Rectangle extends abstraction {
	    double length, width;
	    Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    double area() {
	        return length * width;
	    }
	}

	
