package foreachloop;

public class prog3 {

	public static void main(String[] args) {
		int[] nums = {10, 20, 30};
		int sum = 0;
		for (int n : nums) {
		    sum += n;
		}
		System.out.println("Sum: " + sum);


	}

}
