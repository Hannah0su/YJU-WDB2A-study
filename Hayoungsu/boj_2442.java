import java.util.Scanner;

public class boj_2442 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < n-i; j++)
				System.out.print(" ");
			for(int k = 0; k < i*2-1; k++)
				System.out.print("*");
			System.out.println();
		}

	}
}