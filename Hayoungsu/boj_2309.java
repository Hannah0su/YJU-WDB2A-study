import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_2309 {

	static int sum = 0;
	static int fake = 0;
	static int[] arr = new int[9];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine()); //[0] 첫번째난쟁이키 [1]두번째로 입력받은 난쟁이키 .[2] ..[3]..
			sum += arr[i]; // 모든 난쟁이들의 키를 더한다
		}
		//sum에는 9명(진짜7명 + 가짜 2명)
		
		
		fake = sum - 100; // 가짜 2명의 키를 더한 값 = 9명의 키 합계 - 100
		

		for (int i = 0; i < arr.length-1; i++) { ///난쟁이 1
			for (int j = i+1; j < arr.length; j++) { //난쟁이 2 		j=0
				if (fake == arr[i] + arr[j]) {		
					arr[i] = arr[j] = 0; //가짜 난쟁이들의 값을 0으로 만듦 
					Arrays.sort(arr); //오름차순 정렬하여 가짜 난쟁이들을 인덱스 0,1에 보내줍니다. [0] 가짜한명 [1] 남은가짜한명/ [2]~[8] 진짜 7명의 키
					for (int k = 2; k < 9; k++) {
						System.out.println(arr[k]);//가짜난쟁이의 인덱스 0,1을 제외하고 출력 
					}
					return; //빠져나감
				}
			}
		}
	}

}
