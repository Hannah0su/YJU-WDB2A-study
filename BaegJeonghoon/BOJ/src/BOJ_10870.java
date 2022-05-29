/**
 * 
 * @author Baeg Jeonghoon
 * 2022. 5. 19.
 * URL: 
 * BOJ#10870 - 피보나치 수 5 (B2)
 * ' n이 주어졌을 때, n번째 피보나치 수를 구하라. '
 */

import java.util.Scanner;

public class BOJ_10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(Fibonacci(n));
	}
	
	public static int Fibonacci(int n) {
		// 피보나치 수는 첫번째 항과 두번째 항은 0과 1로 고정
		if(n == 0)
			return 0;
		
		if(n == 1)
			return 1;
		
		return Fibonacci(n-1) + Fibonacci(n-2);
	}

}
