import java.util.Scanner;
 
public class boj_2750 {
	public static void main(String[] args) {
    
		int n;
		int temp;
		
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
 
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int result : arr) {
			System.out.println(result);
		}
 
	}
}