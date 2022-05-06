package baekjoon;

import java.util.*;

public class No11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, K, cnt;
		N = sc.nextInt();
		K = sc.nextInt();
		cnt = 0;
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		for (int i = N - 1; i >= 0; i--) {
			if (array[i] <= K) {
				cnt += (K / array[i]);
				K %= array[i];
			}
		}
		System.out.println(cnt);
	}

}
