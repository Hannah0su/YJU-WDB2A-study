/**
 * @author Baeg Jeonghoon
 * 2022. 4. 22.
 * URL : https://www.acmicpc.net/problem/2750
 * BOJ#2750 - 수 정렬하기
 */
import java.util.Scanner;
import java.util.Arrays;

public class boj_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
