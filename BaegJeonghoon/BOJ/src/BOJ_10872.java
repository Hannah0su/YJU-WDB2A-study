/**
 * 
 * @author Baeg Jeonghoon
 * 2022. 5. 19.
 * URL: https://www.acmicpc.net/problem/10872
 * BOJ#10872 - 팩토리얼 (B3)
 */

import java.util.Scanner;

public class BOJ_10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int result = Factorial(N);
		System.out.println(result);
	}
	
	public static int Factorial(int N) {
		if(N <= 1) // 재귀함수 종료 조건
			return 1;
		
		// N! = N * (N-1) * (N-2) * ... * 1
		return N * Factorial(N-1);
	}

}
