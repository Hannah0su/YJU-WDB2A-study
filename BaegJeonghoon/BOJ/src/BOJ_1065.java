/**
 * @author Baeg Jeonghoon
 * 2022. 4. 28.
 * URL : https://www.acmicpc.net/problem/1065
 * BOJ#1065 - 한수
 */
import java.util.Scanner;

public class BOJ_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N까지의 수
		sc.close();
		int count = 0; // 한수 몇개
		for(int i=1; i<=N; i++) {
			if(i <= 99) { // 1~99까지는 모두 한수이므로
				count  += 1;
			} else if (i < 1000) {
				int hun = i / 100; //백의 자릿수
				int ten = (i/10) % 10; //십의 자릿수
				int one = i % 10; // 일의 자릿수
				
				// 각 자릿수가 수열을 이루면
				if((hun - ten) == (ten - one)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
