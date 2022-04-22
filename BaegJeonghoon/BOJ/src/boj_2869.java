/**
 * @author Baeg Jeonghoon
 * 2022. 4. 22.
 * URL : https://www.acmicpc.net/problem/2869
 * BOJ#2869 - 달팽이는 올라가고 싶다
 */
import java.util.Scanner;

public class boj_2869 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); // up A미터
		int B = sc.nextInt(); // down B미터
		int V = sc.nextInt(); // 나무 높이: V미터
		sc.close();
		
		int day = (V-B) / (A-B);
		
		//나머지가 있으면 day + 1
		if((V-B) % (A-B) != 0) {
			day++;
		}
		System.out.println(day);
	}
}
