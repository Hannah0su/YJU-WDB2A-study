import java.util.Scanner;
import java.util.Arrays;

public class BOJ_11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 줄 서 있는 사람 수
		
		int[] arr = new int[N];
		int sum = 0; // 사람별 대기시간 총합
		int prev = 0; // 이전까지의 대기시간 누적 
		
		// 걸리는 시간을 입력받아 배열에 저장 
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); // 정렬
		
		for(int i=0; i<N; i++) {
			// 이전까지의 대기시간과 현재 사람이 걸리는 시간 더하기
			sum += prev + arr[i];
			// 이전까지의 누적합에 현재 걸리는 시간 더하기
			prev += arr[i];
		}
		System.out.println(sum);
		sc.close();
	}

}
