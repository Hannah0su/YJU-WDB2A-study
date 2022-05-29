package BOJ;

import java.util.Scanner;

public class BOJ_ÆÑÅä¸®¾ó_10872_B3 {
	static int result =1;
	public static void cal(int n) {
		if(n==0) {
			return;
		}
		result *= n;
		n--;
		cal(n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n!=0) {
			cal(n);
			System.out.println(result);
		}else {
			System.out.println(1);
		}
	}
}
