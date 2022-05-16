package BOJ;


	import java.util.Scanner;
	import java.util.Arrays;

	public class BOJ_블랙잭_2798_B2 {
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();//카드의 갯수
	        int [] arr = new int [n];//카드 갯수만큼 배열 선언
	        int sum = sc.nextInt();//블랙잭 규칙을 통해 3장을뽑아 만들 숫자
	        int temp =0;//교환할 숫자
	        int result =0;//결과값 
	        
	        for (int i = 0; i < arr.length; i++) {//배열에다가 카드숫자를 받아 넣는다. 
				arr[i] = sc.nextInt();	
			}
	        
	        Arrays.sort(arr);//정렬한다
	        
	        for (int i = 0; i < arr.length; i++) {
	        	//카드를 3장을 뽑아 sum과의 근사값을 찾아야하므로
	        	//3중포문을 선언하여서 찾는다.
				for (int j = 0; j < arr.length; j++) {
					for (int j2 = 0; j2 < arr.length; j2++) {
						if(i!=j && j!=j2 && i!=j2) {
							//카드를 한번쓰면 못 뽑으므로 i,j,j2의 값이 다 달라야한다. 1,1,1이 되면안된다는 뜻
							temp=arr[i]+arr[j]+arr[j2];//j2를 하나씩 늘려나가면서 경우의 수를 찾는다. 
							if(temp<= sum && result <= temp) {
								//sum보다 작거나 크고 기존의 result값보다 temp가 크거나 같으면 result의 값을 temp로 변환한다.
								result = temp;
							}
						}
					}
				}
			}
	        System.out.println(result);//결과 출력
	    }

}
