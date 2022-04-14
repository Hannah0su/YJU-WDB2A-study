package BOJ;


	import java.util.Scanner;
	import java.util.Arrays;

	public class BOJ_¼¼¼ö_10817_b3 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int [] arr = new int [3];
			for (int i = 0; i < arr.length; i++) {
				arr[i]= sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[arr.length-2]);
		}
		
	}

	
