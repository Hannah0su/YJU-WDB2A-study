package baekjoon;

import java.util.*;

public class No2442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++)
				System.out.print(" ");
			for (int j = 0; j < i * 2 - 1; j++)
				System.out.print("*");
			System.out.println(" ");
		}

	}

}