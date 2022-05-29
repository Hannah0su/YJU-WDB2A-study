import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class boj_2875 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());//여학생
		int m = Integer.parseInt(st.nextToken());//남학생
		int k = Integer.parseInt(st.nextToken());//인턴쉽 인원

        /* 팀은 3명으로 구성된다. 여2 남1 => 2:1 비율이기 때문에 동일 비율로 만들어준뒤에 인턴쉽 인원을 각출해야한다.
         * 총 인턴쉽 인원 k를 반복문을 돌리면서 더 인원 비율이 많은쪽에서 빼주면됨*/

		while(k > 0) {
            if(n / 2 >= m) {
                n--;
                k--;
            } 
            else {
                m--;
                k--;
            }
        }
        System.out.println(Math.min(n / 2, m));
	}

}