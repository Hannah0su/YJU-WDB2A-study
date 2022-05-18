package BOJ;

	import java.util.Scanner;

	public class BOJ_1_2_3_더하기_9095 {
		
		static int cnt=0;//경우의수를 계산할 cnt선언
		public static void cal (int n) {//int n을 받아서 실행한다.
			if(n ==0) {//n이 0이될 경우 경우의수를 다 계산한 것
				cnt ++;
				return ;
			}
			if(n-1>=0){
				//n-1>=0일 경우 n-1한 값을 다시 cal(n-1)을 한다.
				//그후 아래의 if문의 n-2로 들어가고 n-3으로 들어가서
				//모든 경우의 수를 계산하게 된다.
				//n-2로 들어가서도 cal을하고 n-3에서도 콜을하므로 모든경우의수가 계산이된다.
				cal(n-1);
			}
			if(n-2>=0) {
				cal(n-2);
			}
			if(n-3>=0) {
				cal(n-3);
			}
		}

	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int t = sc.nextInt(); //실행할 횟수를 입력받는다.
	      
	      for (int i = 0; i < t; i++) {//실행할 횟수만큼 반복
			int n = sc.nextInt();//어떤 값을 1,2,3,더하기할지 받는다.
			cal(n);//재귀함수 cal(n)을 사용한다.
			System.out.println(cnt);//cnt출력
			cnt =0;//cnt 초기화 
		}
	      
	   }
	}	
