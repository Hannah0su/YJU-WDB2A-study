package BOJ;

import java.util.Scanner;

public class BOJ_달팽이는_올라가고_싶다_2869__B1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		int day = (v -b) / (a-b);	
		if((v -b)%(a-b)!=0) {
				day++;
		}
		System.out.println(day);
		}
}
