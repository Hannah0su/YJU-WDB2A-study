package baekjoon;

import java.util.*;

public class No2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M, sum, result;
		N = sc.nextInt();
		sc.close();
		result = 0;
		for (int i = 0; i < N; i++) {
			M = i;
			sum = 0;
			while (M != 0) {
				sum += M % 10;
				M /= 10;
			}
			if (sum + i == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
