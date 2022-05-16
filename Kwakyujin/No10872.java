package baekjoon;

import java.io.*;

public class No10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N;
		N = Integer.parseInt(br.readLine());
		System.out.println(factorial(N));

	}

	public static int factorial(int N) {
		if (N == 0)
			return 1;
		return N * factorial(N - 1);
	}

}
