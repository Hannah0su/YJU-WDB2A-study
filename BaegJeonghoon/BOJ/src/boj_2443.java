/* <2443, �� ��� -6>
 * ù° �ٿ��� �� 2��N-1��, ��° �ٿ��� �� 2��N-3��, ..., N��° �ٿ��� �� 1���� ��� ����
 * ���� ����� �������� ��Ī�̾�� �Ѵ�.
 */
import java.util.Scanner;
public class boj_2443 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=(2*n)-(i*2-1); k>0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
