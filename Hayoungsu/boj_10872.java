import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class boj_10872 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int result = factorial(n);
		System.out.println(result);
		
	}
	
	public static int factorial(int n) {//재귀로 반복
		if(n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
 
}
 
