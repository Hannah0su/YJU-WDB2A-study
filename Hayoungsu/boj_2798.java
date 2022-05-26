import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class boj_2798 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
 
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());  //배열에 카드 숫자를 저장합니다.
		}
		
		int result = 0;
		
        //3중 반복문으로, 비교를 실행합니다.
		for(int i = 0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					int sum = arr[i] + arr[j] +arr[k];  //세 수를 더합니다.
					if(result < sum && sum <=m) //기존의 합 result보다 크면서 카드의 합 m을 넘지않으면 결과에 저장
						result = sum;
				}
			}
		}
		System.out.println(result);//최종적으로 result에 가장 큰 수끼리의 합이 담기게됩니다.
		
	}
}
		