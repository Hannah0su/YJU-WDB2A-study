/**
 * @author Baeg Jeonghoon
 * 2022. 4. 28.
 * URL : https://www.acmicpc.net/problem/2798
 * BOJ#2798 - 블랙잭
 */
import java.util.Scanner;

public class BOJ_2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N장의 카드
		int M = sc.nextInt(); // 블랙잭 기준점
		
		int[] card = new int[N];
		int sum = 0, max = 0;
		
		// 배열에 카드 숫자 입력
		for(int i=0; i<N; i++) {
			card[i] = sc.nextInt();
		}
		
		// 3장의 카드 합의 모든 경우의 수를 구하는 반복문
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				for(int k=j+1; k<N; k++) {
					sum = card[i] + card[j] + card[k];
					// 합이 M보다 작고 max보다 크면 합을 max에 저장
					if(sum > max && sum <= M) {
						max = sum;
					}
				}
			}
		}
		System.out.println(max);
		sc.close();
	}

}
