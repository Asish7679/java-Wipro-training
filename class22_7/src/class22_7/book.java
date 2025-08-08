package class22_7;
import java.util.Scanner;

public class book {
	String name;
	int id;
	String author;
	
	void getdetail(Scanner sc) {
		System.out.println("name of book");
		name= sc.nextLine();
		System.out.println("id of book");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Author of book");
		author=sc.nextLine();
	}
	void Display(){
		System.out.println("Book Details");
		System.out.println("Name:"+name);
		System.out.println("ID:"+id);
		System.out.println("Author:"+author);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		book b=new book();
		b.getdetail(sc);
		b.Display();

	}

}
