/**
 * @author Baeg Jeonghoon
 * 2022. 4. 28.
 * URL : https://www.acmicpc.net/problem/2309
 * BOJ#2309 - 일곱 난쟁이
 */
import java.util.Scanner;
import java.util.Arrays;

public class BOJ_2309 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] height = new int[9];
		int sum = 0;
		int a = 0,
			b = 0;
		
		//'난쟁이 키 입력' 반복문
		for(int i=0; i<height.length; i++) {
			height[i] = sc.nextInt();
			sum += height[i]; //sum = 난쟁이 9명 키의 합
		}
		Arrays.sort(height); //난쟁이 키 오름차순 정렬
		
		// 2명의 난쟁이 키의 모든 경우의 수를 구하는 반복문
		for(int j=0; j<height.length-1; j++) {
			for(int k=j+1; k<height.length; k++) {
				//9명 키의 합에서 2명의 키를 뺐을 때 100이 나오면 범인!
				if(sum - height[j] - height[k] == 100) {
					a = j; // 범인1
					b = k; // 범인2
					break;
				}
			}
		}
		// 진짜 난쟁이 키
		for(int m=0; m<height.length; m++) {
			if(m == a || m == b) // 범인이면 출력 X
				continue;
			System.out.println(height[m]);
		}
		sc.close();
	}

}