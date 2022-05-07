package baekjoon;

import java.util.*;

public class No2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		while (true) {
			if (N % 5 == 0) {
				cnt += N / 5;
				System.out.println(cnt);
				break;
			} else {
				N -= 3;
				cnt++;
			}
			if (N < 0) {
				System.out.println(-1);
				break;
			}
		}
		sc.close();

	}

}
