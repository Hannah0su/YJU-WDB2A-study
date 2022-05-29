package BOJ;

import java.util.Scanner;

public class BOJ_과제_안_내신_분_5597_B2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[30];
		for (int i = 0; i < arr.length-2; i++) {
			int s = sc.nextInt();
			arr[s-1] = s;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] ==0) {
				System.out.println(i+1);
			}
		}		
	}
}
