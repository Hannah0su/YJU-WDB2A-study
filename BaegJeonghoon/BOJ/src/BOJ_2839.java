/**
 * @author Baeg Jeonghoon
 * 2022. 5. 9.
 * URL: https://www.acmicpc.net/problem/2839
 * BOJ#2839 - 설탕 배달
 */
import java.util.Scanner;

public class BOJ_2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		int count = 0;
		while(true) {
			// 5의 배수는 5kg 봉지만으로 구성 가능하니까
			if(N%5 == 0) {
				count += N/5;
				System.out.println(count);
				break;
			} else { // 5의 배수가 아닌 경우, 입력받은 값에서 3kg씩 빼가며 다시 반복
				N = N-3;
				count++; // 3kg 봉지, count에 1추가
			}
			
			if(N<0) { // 끝까지 나누어 떨어지지 않는다면 -1 출력
				System.out.println(-1);
				break;
			}
		}
	}

}
