package baekjoon;

import java.io.*;
import java.util.*;

public class No10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N;
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
			case "push":
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				System.out.println(stack.isEmpty() ? -1 : stack.pop());
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				System.out.println(stack.isEmpty() ? 1 : 0);
				break;
			case "top":
				System.out.println(stack.isEmpty() ? -1 : stack.peek());
				break;
			}
		}
	}
}