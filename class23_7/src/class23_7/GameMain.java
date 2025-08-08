package class23_7;
import java.util.Scanner;
public class GameMain {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Game st=new start();
	        Game pl=new play();
	        Game ex=new exit();

	        System.out.println("Choose Option");
	        int Choice = sc.nextInt();
	        sc.nextLine();

	        if (Choice == 1) {
	            st.Start();
	        } else if (Choice == 2) {
	            pl.Play();
	        } else if (Choice ==3) {
	          	ex.Exit();
	        }
	        else {
	            System.out.println("Invalid device selected.");
	            return;
	        }}}


