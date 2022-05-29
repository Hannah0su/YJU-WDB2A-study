import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class boj_1065 {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		int cnt = n;
		
		if (n<=99) {            	//100이하의 수는 그 자신이 값임
			bw.write(cnt+"\n");
			}
		
		else {
			cnt = 99;

			for(int i = 100; i<=n; i++) {

				int a = i/100;      //100의 자릿수 a

				int b = (i/10)%10;  //10의 자릿수 b
				
				int c = i%10;       //1의 자릿수 c
				
				if (a-b == b-c)
				     //공차가 같으면 한수, +1
					cnt++;
			}

			bw.write(cnt+"\n");	
		}	
		br.close();
		bw.flush();
		bw.close();
		}
	}
