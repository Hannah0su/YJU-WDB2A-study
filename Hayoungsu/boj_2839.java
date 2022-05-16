import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class boj_2839 {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

        br.close();

        while(true) {
            if(n%5 == 0) {//5로 나누어떨어지는 경우엔 바로 출력
                cnt += n/5;
                System.out.println(cnt);
                break;
            }
            else {//이외에는 3씩 빼가면서 다시 반복
                n-=3;
                cnt++;
            }

            if(n<0) {//-3을 반복해도 나눌 수 없는 경우엔 -1
                System.out.println(-1);
                break;
            }
        }
		
 
	
	}
}