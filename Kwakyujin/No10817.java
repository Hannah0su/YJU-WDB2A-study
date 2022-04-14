package baekjoon;

import java.util.*;

public class No10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[3];
		for (int i = 0; i < 3; i++)
			list[i] = sc.nextInt();
		Arrays.sort(list);
		System.out.println(list[1]);
		sc.close();
	}

}