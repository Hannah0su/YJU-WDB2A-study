package BOJ;
import java.util.Scanner;

public class BOJ_º°Âï±â5_2442_b3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();	
		for (int i = 1; i < sum+1; i++) {
			for (int j = 0; j < sum-i; j++) {
				System.out.print(" ");
				}
			for (int j = 1; j < i+1; j++) {
				System.out.print("*");
			}
			for (int j2 = 1; j2 < i && i !=1; j2++) {					
				System.out.print("*");
				
			}
					
				
				
				
				System.out.println("");
				
			}
			
		
			
		}
	}

