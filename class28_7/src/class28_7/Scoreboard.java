package class28_7;
import java.util.*;

public class Scoreboard {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        HashMap<String, Integer> scoreMap = new HashMap<>();

	        System.out.print("Enter number of players: ");
	        int n = sc.nextInt();
	        sc.nextLine();
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter player name: ");
	            String name = sc.nextLine();
	            System.out.print("Enter score: ");
	            int score = sc.nextInt();
	            sc.nextLine(); 
	            scoreMap.put(name, score);
	        }

	        System.out.println("Scoreboard:");
	        for (String player : scoreMap.keySet()) {
	            Integer playerScore = scoreMap.get(player);
	            System.out.println(player + ": " + playerScore + " points");
	        }
	    }
	}

