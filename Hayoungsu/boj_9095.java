import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class boj_9095 {
	static int cnt;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			cal(n);
			System.out.println(cnt);
			cnt = 0;//출력후 다음 출력을 위해 다시 0으로 초기화
		}
	}

	private static void cal(int n) {//모든 경우의 수를 탐색하며 cnt에 1씩 증가
		if(n == 0) {
			cnt++;
			return;
		}
		if(n-1>=0) {
			cal(n-1);
		}
		if(n-2>=0) {
			cal(n-2);
		}
		if(n-3>=0) 
			cal(n-3);
		}
	}

}
