package class01_8;
import java.io.*;
import java.util.*;
public class Seri implements Serializable {
	int age;
	String name;
	String department;
	public Seri(int age,String name,String department) {
		this.age=age;
		this.name=name;
		this.department=department;
	}
	public static void main(String[] args) {
		
		        try {
		            Seri s1 = new Seri(23, "Asish","Computer");

		            FileOutputStream fos = new FileOutputStream("student.dat");
		            ObjectOutputStream oos = new ObjectOutputStream(fos);

		            oos.writeObject(s1);
		            oos.close();
		            fos.close();

		            System.out.println("Object serialized successfully!");
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        try {
		            FileInputStream fis = new FileInputStream("student.dat");
		            ObjectInputStream ois = new ObjectInputStream(fis);

		            Seri s = (Seri) ois.readObject(); 
		            ois.close();
		            fis.close();

		            System.out.println("Age: " + s.age+ ", Name: " + s.name+ ", Department:"+s.department);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }

}
