package baekjoon;

import java.io.*;

public class No9095 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T, N;
		T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			System.out.println(addition(N));
		}
	}

	public static int addition(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		if (N == 2)
			return 2;
		if (N == 3)
			return 4;
		else
			return addition(N - 1) + addition(N - 2) + addition(N - 3);
	}
}
