package class30_7;
import java.util.*;

public class doctor {
	static class doc{
	int licno;
	String name;
	String department;
	doc(int licno,String name,String department){
		this.licno=licno;
		this.name=name;
		this.department=department;
	}
		
		public String toString() {
			return "[License no.:" + licno+", Name :"+name+", Department: "+department +"]";
		}
		
		  public boolean equals(Object o) {
	            if (this == o) return true;         
	            if (!(o instanceof doc)) return false;  
	            doc d = (doc) o;
	            return this.licno == d.licno;   
	        }

	        
	        public int hashCode() {
	            
	            return Objects.hash(licno);
	        }
	}
	public static void main(String args[]) {
		
		HashSet<doc> doct=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Doctor Menu");
			System.out.println("1.Register Doctor");
			System.out.println("2.View all Doctors");
			System.out.println("3.Exit");
			System.out.println("Enter Choice");
			int choice;
			choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:{
				System.out.println("Enter License Number");
				int licno=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name of the doctor");
				String name=sc.nextLine();
				System.out.println("Enter Department");
				String department=sc.nextLine();
				
				doc d=new doc(licno,name,department);
				if(doct.add(d)) {
					System.out.println("Doctor Registered");
				}
				else {
					System.out.println("Already Registered");
					
				}
				break;}
			case 2:{
				for(doc dr : doct) {
					System.out.println(dr);
					
				}
				break;
				}
				
			
            case 3: {
                System.out.println("Exiting... Thank you!");
                sc.close();
                return;
            }

            default: {
                System.out.println("Invalid Choice! Please try again.");
            }
			}}}}
        
    

