package baekjoon;

import java.util.*;

public class No1065 {
	private static int single_stroke(int N) {
		int cnt = 0;
		if (N < 100) {
			return N;
		} else {
			cnt = 99;
			if (N == 1000)
				N = 999;
			for (int i = 100; i <= N; i++) {
				int a = i / 100;
				int b = (i / 10) % 10;
				int c = i % 10;
				if (a - b == b - c)
					cnt++;
			}
			return cnt;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(single_stroke(N));
		sc.close();
	}

}
