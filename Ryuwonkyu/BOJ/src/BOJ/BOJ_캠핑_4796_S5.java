package BOJ;

import java.util.Scanner;

public class BOJ_캠핑_4796_S5 {
public static void main(String[] args)   {
		
		Scanner sc = new Scanner(System.in);
		int testcase =1; //테스트케이스를 출력하기 위한 변수선언 1부터시작
		while(true) {
		int l = sc.nextInt();//p일 중캠핑장을 사용할 수 있는 날
		int p = sc.nextInt();//캠핑장을 사용가능한 날 
		int v = sc.nextInt();// 휴가날
		int date =v; //v의 날을 date란변수에 복사한다.
		int count =0 ; // 캠핑을 며칠동안했는지 count한다.
		
		if(l==p && p==v && v==0) {break;}//0 0 0 을 입력받으면 멈춘다.
		
		for (int i = 0; i <= v/p; i++) { //총일수/캠핑가능한일을 나눈값만큼 돌아야한다.
			if(date>l) { //캠핑가능한날이 date보다 더 큰경우
				count += l; //l만큼 캠핑을하였다.
				date -= p;// 연속으로 캠핑가능한 날을 date에서 빼준다.
			}else {//만약에 v <=l일 경우
				count+= date; //남은 date의 수를 count에다가 더해준다. 
			}
		}
		System.out.printf("Case %d: %d\n",testcase,count);//출력
		testcase++;//테스트케이스 1증가.
		}

	}
}
