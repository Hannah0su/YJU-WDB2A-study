/**
 * 
 * @author Baeg Jeonghoon
 * 2022. 5. 19.
 * URL: acmicpc.net/problem/9095
 * BOJ#9095 - 1,2,3 더하기
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다.
 */
import java.util.Scanner;

public class BOJ_9095 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수 T 
		
		for(int i=0; i<T; i++) {
			int n = sc.nextInt(); // 정수 n
			
			System.out.println(Plus123(n));
		}
		sc.close();
	}
	
	public static int Plus123(int n) {
		if(n <= 0)
			return 0;
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		if(n == 3)
			return 4;
		else
			return Plus123(n-1) + Plus123(n-2) + Plus123(n-3);
	}

}
