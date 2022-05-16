import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class boj_11047 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[n];
		
		for(int i = 0; i < n; i++) {//입력할때 오름차순으로 입력해준다고 명시해서, 정렬은 필요없음. 순서대로 담기
			coin[i] = Integer.parseInt(br.readLine());
		}

        br.close();
		
		int cnt = 0;
 
		for(int i = n-1; i >= 0; i--) { //제일 큰 금액부터 빼가면서 반복
 			if(coin[i] <= k) {
				cnt += (k / coin[i]);
				k %= coin[i];       //나머지 갱신
			}
		}
		System.out.println(cnt);
	}
 
}