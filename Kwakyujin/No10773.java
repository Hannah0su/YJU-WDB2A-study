package baekjoon;

import java.util.*;

public class No10773 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<Integer> stack = new Stack<Integer>();

		int N, num, sum;
		N = sc.nextInt();
		sum = 0;
		
		for (int i = 0; i < N; i++) {
			num = sc.nextInt();

			if (num == 0) {
				stack.pop();
			} else {
				stack.push(num);
			}
		}

		for (int x : stack) {
			sum += x;
		}
		System.out.println(sum);
		
		sc.close();
	}

}