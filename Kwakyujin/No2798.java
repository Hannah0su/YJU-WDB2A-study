package baekjoon;

import java.util.*;

public class No2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M, three_card, sum;
		three_card = sum = 0;
		N = sc.nextInt();
		M = sc.nextInt();
		int[] array = new int[N];
		
		for (int i = 0; i < N; i++)
			array[i] = sc.nextInt();
		
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					sum = array[i] + array[j] + array[k];
					if (sum <= M && M - sum < M - three_card) {
						three_card = array[i] + array[j] + array[k];
					}
				}
			}
		}
		System.out.println(three_card);
		sc.close();
	}

}
