package BOJ;


	import java.util.Scanner;
	import java.util.Arrays;

	public class BOJ_�ϰ�_������_2309_B1 {
		public static void main(String[] args) {
		int []arr = new int [9];		
		int sum = 0; // ��糭������ Ű���� ���ϴ� ��
			int n=0; // sum-100�� �Ͽ� �� �ΰ��� ���� �迭���� 2���� �̾� �������� true�� ���� ã�´�.
			//9���� 2���� ���� �ǹǷ� �E �θ��� �迭��ġ�� x,y���ٰ� �����ؼ� ã�´�.
			int x =0;
			int y = 0;
			Scanner sc = new Scanner(System.in);
			
			for (int i = 0; i < 9; i++) {
				arr [i] = sc.nextInt();
				
			}
			
			Arrays.sort(arr);//�迭����
			for (int i = 0; i < 9; i++) {
				sum += arr[i];
				
			}
			
			if(sum > 100) {
				n=sum-100;//n�ǰ��� sum-100���Ͽ� x+y�� ���� n�� �ɰ�� �����̸� ã�����̴�.
					
					for (int i = 0; i < arr.length; i++) {
						//ã�ƾ� �ϴ� �����̰� 2���̹Ƿ� ���������� �����Ѵ�.
						for (int j = 0; j < arr.length; j++) {
							if(arr[i]+arr[j]==n) {
								//arr[i] + arr[j] ==n�� �� ��� �� �����̰� ��¥��. 
								x = i;
								y = j;
							}
						}
					}
				
			}
			
			for (int i = 0; i < arr.length; i++) {
				//��¥ �����̸� ã�����Ƿ� x,y�� �ش��ϴ� ��ġ�� �迭�� �������ʴ´�. 
				if(i==x || i==y) {
					continue;
				}else {
				System.out.println(arr[i]);
				}
			}
			}
		}


