package baekjoon;

import java.util.*;

public class No2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			int n = sc.nextInt();
			array[i] = n;
			sum += n;
		}
		sc.close();
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (sum - array[i] - array[j] == 100) {
					array[i] = 0;
					array[j] = 0;
					for (int k = 0; k < array.length; k++) {
						if (array[k] != 0)
							System.out.println(array[k]);
					}
					return;
				}
			}
		}
		

	}

}
