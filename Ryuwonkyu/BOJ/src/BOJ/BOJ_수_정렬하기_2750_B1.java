package BOJ;

import java.util.Scanner;
import java.util.Arrays;

public class BOJ_수_정렬하기_2750_B1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			int [] arr = new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			for (int i : arr) {
				System.out.println(i);
			}
			
			
		}
}
