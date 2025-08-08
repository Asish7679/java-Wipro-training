package class22_7;
import java.util.Scanner;
public class array2d_input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int col=3;
		int row=3;
		int[][] matrix=new int[col][row];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
		          System.out.print("Enter element [" + i + "][" + j + "]: ");
	                matrix[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("\nMatrix is:");
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
			}

	}


