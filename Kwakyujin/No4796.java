package baekjoon;

import java.util.*;

public class No4796 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L, P, V, i, result;
		i = 0;

		while (true) {
			i++;
			result = 0;
			L = sc.nextInt();
			P = sc.nextInt();
			V = sc.nextInt();
			if (L + P + V == 0)
				break;
			while (V - P > 0) {
				V -= P;
				result += L;
			}
			if (L >= V) {
				result += V;
			} else {
				result += L;
			}
			System.out.println("Case " + i + ": " + result);
		}
		sc.close();
	}

}
