import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class boj_10870 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
 
		System.out.println(fibonacci(n));
 
	}
    
	static int fibonacci(int n) {   //F(n) = F(n-1) + F(n-2), 피보나치 수는 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597...
		if (n == 0)//0과 1인 경우
            return 0;
		else if (n == 1)
            return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);//외에는 재귀로 피보나치 수식을 반환
	}
}
