package baekjoon;

import java.util.*;

public class No2875 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M, K, cnt;
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		sc.close();
		cnt = 0;
		while (N >= 2 && M >= 1 && N + M >= 3 + K) {
			N -= 2;
			M -= 1;
			cnt++;
		}
		System.out.println(cnt);
	}

}
