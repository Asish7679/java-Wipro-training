package class22_7;
import java.util.Scanner;

public class atm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] notes = {{2000, 0}, {500, 0}, {100, 0}};
        int choice;

        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Show\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                for (int i = 0; i < notes.length; i++) {
                    System.out.print("₹" + notes[i][0] + " count: ");
                    notes[i][1] += sc.nextInt();
                }

            } else if (choice == 2) {
                System.out.print("Enter amount: ");
                int amt = sc.nextInt(), temp;
                int[] used = new int[3];

                for (int i = 0; i < notes.length; i++) {
                    temp = Math.min(amt / notes[i][0], notes[i][1]);
                    used[i] = temp;
                    amt -= temp * notes[i][0];
                }

                if (amt == 0) {
                    for (int i = 0; i < notes.length; i++)
                        notes[i][1] -= used[i];
                    System.out.println("Withdrawn!");
                } else {
                    System.out.println("Can't withdraw exact amount.");
                }

            } else if (choice == 3) {
                for (int i = 0; i < notes.length; i++)
                    System.out.println("₹" + notes[i][0] + " : " + notes[i][1]);

            }

        } while (choice != 4);
        sc.close();
    }
}
