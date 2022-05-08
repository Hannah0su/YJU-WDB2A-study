import java.util.Scanner;

public class boj_5597 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean[] array = new boolean[30];
		
		for(int i = 0; i < 28; i++) {
			int student = input.nextInt();
			array[student-1] = true;
		}
		
		for(int j = 0; j < 30; j++) {
			if(array[j] != true)
				System.out.println(j+1);
		}

	}

}
