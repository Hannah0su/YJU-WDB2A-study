import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
 
public class boj_11399 {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
        
        br.close();
		Arrays.sort(arr);
 
 
		int cnt = 0;	// 누산한 값을 담을 변수
		int result = 0;	// 필요한 시간의 합의 최솟값
				
		for(int i = 0; i < arr.length; i++) {	
			cnt += arr[i];
            result += cnt;
		}
		System.out.println(result);
	}
}