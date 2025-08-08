package class30_7;
import java.util.*;
public class treeset {
	
	    public static void main(String[] args) {
	        TreeSet<String> names = new TreeSet<>();

	        names.add("Ravi");
	        names.add("Asish");
	        names.add("Nikita");
	        names.add("Ravi");  
	        names.add("Kiran");
	        
	        for(String name :names) {
	        	System.out.println("Name: " +name);
	        }

	    }
	}


