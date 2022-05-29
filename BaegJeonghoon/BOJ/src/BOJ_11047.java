/**
 * @author Baeg Jeonghoon
 * 2022. 5. 9.
 * URL: https://www.acmicpc.net/problem/11047
 * BOJ#11047 - 동전0
 */
import java.util.Scanner;

public class BOJ_11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 준규가 가진 동전은 총 N종류
		int K = sc.nextInt(); // 그걸로 K(원) 만들고 싶음
		
		int[] coin = new int[N];
		
		for(int i = 0; i < N; i++) {
			coin[i] = sc.nextInt(); // 갖고 있는 동전의 종류를 입력받아 배열에 넣기
		}
		
		int count = 0; // K원 만드는데 사용된 동전의 개수 세기
 
		// 가장 비싼 동전부터 내려가며 반복
		for(int i = N - 1; i >= 0; i--) {
			if(coin[i] <= K) { // 해당 동전의 가치가 목표 금액보다 작다면
				count += (K / coin[i]); // 해당 동전을 몇 개 썼는지
				K = K % coin[i]; // 남은 금액
			}
		}
		System.out.println(count);
		sc.close();
	}

}
