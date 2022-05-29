package BOJ;

import java.util.Scanner;

public class BOJ_분해합_2231 {
	/*
	 * 문제이해
	 * n값을 받아서 반복문을 사용해서 1부터 n값까지 돈다.
	 * 만약에 반복문이 도는동안 i의 값 + i의 각 자리값이 n이 된다면
	 * 생성자가된다. 
	 * 생성자가 여러개 일 수도 있으므로 생성자 중 제일 작은 값을 출력한다.
	 * 생성자가 없으면 0을 출력한다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 999999999; //생성자 중에서 가장 작은 값을 저장한다.
		int result =0;//생성자의 값을 저장한다.
		int cnt =0; //반복문의 i값을 담는다.
		int temp =0;//i의 각 자리수 값을 담는다. 
		for (int i = 1; i < n; i++) {//1부터 n값까지 돈다.
			cnt =i; // cnt에 i의 값을 담는다.
			temp = 0;// temp=0으로 초기화 한다.
			
			while(true) {//cnt가 0이 되면 멈춘다.
				if(cnt==0) {
					break;
				}
				//아래의 코드는 cnt의 자리수를 temp에 담는 과정이다.
				temp += cnt%10;
				cnt /=10;
				
			}
			
			result = temp+i; 
			//temp가 각 자리수의 합 , i는 반복문의 횟수가 더한값이 result로 정한다
			if(result == n) {//만약 result값과 n값이 작다면
				if(min >i) {//min에 담긴값이 i보다 크다면
					min =i;//min에 담긴 값을 i로 교체한다. 
				}
			}
			
		}
		
		if(min!=999999999) {//초창기 min값이 아니라면 min이 제일작은 생성자
			System.out.println(min);
		}else {//그외는 생성자가 없다.
			System.out.println(0);
		}
		
	}

}
