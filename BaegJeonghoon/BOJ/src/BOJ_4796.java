/**
 * @author Baeg Jeonghoon
 * 2022. 5. 8.
 * URL: https://www.acmicpc.net/problem/4796
 * BOJ#4796 - 캠핑
 */
import java.util.Scanner;

public class BOJ_4796 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caseNum = 1;
		while(true) {
			int L = sc.nextInt(); // 캠핑장, P일 중 L일 동안 이용 가능 
			int P = sc.nextInt(); // 캠핑장, 연속하는 P일
			int V = sc.nextInt(); // 총 휴가는 V일
			
			if(L == 0) // 0입력 시 종료
				break;
			
			System.out.println("Case "+caseNum+ ": " + ((V/P)*L+Math.min(L,(V%P))));
			caseNum++;
		}
		sc.close();
	}

}
