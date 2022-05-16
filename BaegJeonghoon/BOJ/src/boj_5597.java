/**
 * @author Baeg Jeonghoon
 * 2022. 4. 22.
 * URL : https://www.acmicpc.net/problem/5597
 * BOJ#5597 - 과제 안 내신 분..?
 */
import java.util.Scanner;
public class boj_5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] studentNum = new boolean[31];
		
		for(int i=1; i<=28; i++) {
			int submit = sc.nextInt();
			studentNum [submit] = true;
		}
		
		for(int i=1; i<studentNum.length; i++) {
			if(studentNum[i] == false)
				System.out.println(i);
		}
		sc.close();
	}

}
