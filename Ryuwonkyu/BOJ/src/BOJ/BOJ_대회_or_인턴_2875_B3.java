package BOJ;

import java.util.Scanner;

public class BOJ_대회_or_인턴_2875_B3 {

	public static void main(String[] args) {
		/*
		 * 테스트케이스 생각
		 * 여자2명 남자1명이 무조건 같이가야한다
		 * 그 인원수 만큼 빼고 k 인원만큼 인턴쉽에 참가가 가능해야만한다.
		 * 참가가 불가능할 경우 0을 출력한다.
		 * 하지만 팀이 2명이상이고 한조가 같이 안갈경우 인턴쉽의 인원이 될경우에는 간다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 여자의수
		int m = sc.nextInt(); // 남자의 수
		int k = sc.nextInt(); //인턴쉽에 참가 인원수'
		int cnt =0;//몇개의 조가 가는지 출력
		
		while(true) {//무한 반복
			if(n<2 || m <1) {
				//n이 2보다 작고 m이 1보다 작을경우 조를 구성할 수 없으므로 멈춘다
				break;
			}
			if(n-2>=0 &&m-1 >=0) {
				//n-2,m-1이 가능 할 경우에 cnt를 증가시킨다.
				n-=2;
				m-=1;
				cnt++;
			}
		}
		//위에서 조를 이루었으므로 인턴십인원만 채우면 정답.
		
		if(n+m>=k) {//n+m이 k보다 크거나 같을 경우 cnt를 출력한다.
			System.out.println(cnt);
		}else if(n+m <k ) {//k보다 n+m이 작을 경우 
			while(true) {//무한반복
				//한조를 해체해서 여자와 남자의 인원을 증가하고 조를 뺀다.
				//그후 그 인원이 인턴쉽을 보내야하는 학생수인지 검사 
				if(n+m>=k) {//n+m이 k보다크다면 멈춘다. 
					break;
				}
				n+=2;
				m+=1;
				cnt-=1;
			}
			if(cnt>0) {//cnt가 0보다 크다면 cnt 출력
				System.out.println(cnt);
			}else {//만약에 cnt가 0보다 작은 경우에는 조건을 달성할 수 없으므로 0을 출력한다.
				System.out.println(0);
			}
		}
	}
}