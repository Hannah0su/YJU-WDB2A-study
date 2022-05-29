import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class boj_2231 {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
		String n = br.readLine();
		int length = n.length();;//입력값의 길이 저장
 
		int num = Integer.parseInt(n);//입력값 숫자로 형변환
        int startNum = num-(9 * length);//반복문의 시작점, 자리수*9를 빼주면 최소값을 구할 수 있다.
		int result = 0;//생성자가 없을 시 0을 반환할 것
 
        for(int i=startNum; i<num; i++) {//작은 수 부터 모든 경우를 탐색하며 분해합을 만든다.
            int sum = i; //분해합
            int j = i;  //자리수
            while(j > 0) {
                sum += j%10; //sum에 i와 더불어 각 자리수가 합산된다.
                j /= 10;//10을 나눈 몫은 다음 반복문에 쓰인다.
            }
            if(sum == num) {//일치하면 생성자를 찾아낸 것
                result = i;
                break;
            }
        }

        br.close();
		System.out.println(result);
	}
 
}