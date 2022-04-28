package BOJ;


	import java.util.Scanner;
	import java.util.Arrays;

	public class BOJ_일곱_난쟁이_2309_B1 {
		public static void main(String[] args) {
		int []arr = new int [9];		
		int sum = 0; // 모든난쟁이의 키를다 더하는 값
			int n=0; // sum-100을 하여 이 두개의 값을 배열에서 2개를 뽑아 더했을때 true인 값을 찾는다.
			//9명중 2명을 빼면 되므로 뺼 두명의 배열위치를 x,y에다가 저장해서 찾는다.
			int x =0;
			int y = 0;
			Scanner sc = new Scanner(System.in);
			
			for (int i = 0; i < 9; i++) {
				arr [i] = sc.nextInt();
				
			}
			
			Arrays.sort(arr);//배열정열
			for (int i = 0; i < 9; i++) {
				sum += arr[i];
				
			}
			
			if(sum > 100) {
				n=sum-100;//n의값을 sum-100을하여 x+y의 값이 n이 될경우 난쟁이를 찾은것이다.
					
					for (int i = 0; i < arr.length; i++) {
						//찾아야 하는 난쟁이가 2명이므로 이중포문을 선언한다.
						for (int j = 0; j < arr.length; j++) {
							if(arr[i]+arr[j]==n) {
								//arr[i] + arr[j] ==n이 될 경우 두 난쟁이가 가짜다. 
								x = i;
								y = j;
							}
						}
					}
				
			}
			
			for (int i = 0; i < arr.length; i++) {
				//가짜 난쟁이를 찾았으므로 x,y에 해당하는 위치의 배열은 말하지않는다. 
				if(i==x || i==y) {
					continue;
				}else {
				System.out.println(arr[i]);
				}
			}
			}
		}


