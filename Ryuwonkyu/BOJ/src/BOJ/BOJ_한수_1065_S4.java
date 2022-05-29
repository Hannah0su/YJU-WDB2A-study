package BOJ;



import java.util.Scanner;


public class BOJ_한수_1065_S4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//1부터 찾을 한수의 범위를 받는다.
        int count = 0;//한수가 몇개인지 셀 용도
        int mul = 0;//배열안에 100의 자리수, 10의 자리수,1의 자리수를 넣기 위한 용도
        int [] arr = new int [3];//백의자리, 십의자리, 일의자리를 넣는 배열
       
        for (int i = 1; i <= num; i++) {//1부터 num값까지 실행한다.
			if(i < 100) {//1~99까지는 모두 한수가 된다 그러므로 그냥 count++을한다.
				count++;
			}else if(100<= i && i < 1000) {
				//한수의 범위가 100~1000까지 일경우에는 한수 일 수도 있고 아닐 수도 있다.
				mul =i;//mul을 i값으로 설정한다.
				for (int j = 2; j >=0 ; j--) {
					//mul값을 일의자리부터 백의자리까지 순서대로 짤라서 적재한다. 
					arr[j] = mul%10;
					mul /=10;
				}

				if(arr[0]-arr[1] == arr[1]-arr[2]) {
					//등차수열이므로 첫번쨰 두번째 마이너스값과 두번째 세번쨰 뺸값이 같아야 등차수열을 이룬다. 
					count++;//등차수열을 이루므로 count++을 실행한다.
				}
			}else if(i==1000) {//1000의 경우에는 등차수열이 아니고 문제의 범위가 1000까지 이므로 따로 설정한다.
				
			}
		}
        System.out.println(count);//한수의 갯수를 말한다.
    }
}

