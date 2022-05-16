package BOJ;


	import java.util.Scanner;

	public class BOJ_º°Âï±â6_2443_b3 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int s = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}for (int j = 0; j < 2*n-s; j++) {
					System.out.print("*");
				}
				System.out.println("");
				s += 2;
			}
			
		}
	}

