package baekjoon;

import java.util.*;

public class No11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, sum, a;
		N = sc.nextInt();
		sum = 0;
		a = 0;
		int[] array = new int[N];
		for (int i = 0; i < N; i++)
			array[i] = sc.nextInt();
		sc.close();
		Arrays.sort(array);
		for (int i = 0; i < N; i++) {
			a += array[i];
			sum += a;
		}

		System.out.println(sum);
	}

}
