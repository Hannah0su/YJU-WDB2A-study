/* <10817, �� ��>
 * �� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
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