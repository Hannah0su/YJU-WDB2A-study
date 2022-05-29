import java.util.Scanner;

public class BOJ_2875 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 여학생 수
        int M = sc.nextInt(); // 남학생 수
        int K = sc.nextInt(); // 인턴쉽에 참여해야하는 인원 K
        sc.close();
        
        int count =0; // 팀의 개수

        /* 여학생이 2명 이상이고,
         * 남학생이 1명 이상이고, 
         * 남은 학생의 수 >= 제외할 학생의 수 + 한 팀
         * 을 만족하면 count+1 */
        while(N>=2 && M>=1 && M+N >=3+K) {
            N = N-2;
            M = M-1;
            count++;
        }
        System.out.println(count);
	}

}
