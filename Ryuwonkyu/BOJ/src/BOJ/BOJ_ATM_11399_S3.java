package BOJ;


	import java.util.Scanner;
	import java.util.Arrays;

	public class BOJ_ATM_11399_S3 {
		public static void main(String[] args)   {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//사람수 입력받기
		int [] arr = new int[n];//순서대로 걸리는 시간 입력받기
		int result =0;//총 걸리는 시간 담을 변수
		int count =0;//누적으로 더할 변수 
		for (int i = 0; i < arr.length; i++) {//배열에 걸리는 시간 받기
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);//정렬하기
		
		for (int i = 0; i < arr.length; i++) {
			count += arr[i];//count에 배열의 값 누적으로 더하기
			result += count;//result 누적값 count랑 더하기 
		}
		System.out.println(result);
		
		}
	}

