package class30_7;
import java.util.HashMap;
import java.util.Map;
public class HashMapEx {
	
	    public static void main(String[] args) {
	        HashMap<Integer, Patients> pmap = new HashMap<>();

	        pmap.put(101, new Patients(101, "Asish", "Cold"));
	        pmap.put(102, new Patients(102, "Rabi", "Fever"));
	        pmap.put(103, new Patients(103, "Aman", "Flu"));
	    

	        System.out.println("\nGet Patient with ID 102:");
	        System.out.println(pmap.get(102));

	        System.out.println("\nDoes ID 101 exist?");
	        System.out.println(pmap.containsKey(101));

	        System.out.println("\nDoes Patient Asish exist?");
	        boolean found = pmap.containsValue(new Patients(101, "Asish", "Cold"));
	        System.out.println(found); 
	        
	        System.out.println("\nTotal Patients: " + pmap.size());

	           
	        System.out.println("\nAll Patient IDs:");
	        System.out.println(pmap.keySet());
	            
	        System.out.println("\nAll Patients:");
	        for (Patients p : pmap.values()) {
	                System.out.println(p);
	         }
	        System.out.println("\nUpdating Disease of ID 102...");
	        pmap.replace(102, new Patients(102, "Rabi", "Recovered"));
	        System.out.println(pmap.get(102));

	      
	        System.out.println("\nRemoving Patient with ID 103...");
	        pmap.remove(103);
	        System.out.println("Patients after removal: " + pmap);

	        System.out.println("\nClearing all Patients...");
	        pmap.clear();
	        System.out.println("Is HashMap empty? " + pmap.isEmpty());
	        }
	    }
