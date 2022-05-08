package baekjoon;

import java.util.*;

public class No2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < list.length; i++)
			list[i] = sc.nextInt();
		Arrays.sort(list);
		for (int x : list)
			System.out.println(x);
		sc.close();
	}
}