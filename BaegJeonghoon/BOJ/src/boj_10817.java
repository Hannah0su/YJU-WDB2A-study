/* <10817, 세 수>
 * 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
 */
import java.util.Scanner;
import java.util.Arrays;
public class boj_10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		for(int i =0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(num);
		System.out.println(num[1]);
	}

}