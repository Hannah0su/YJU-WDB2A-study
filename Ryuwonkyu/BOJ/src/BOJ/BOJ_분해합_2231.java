package BOJ;

import java.util.Scanner;

public class BOJ_������_2231 {
	/*
	 * ��������
	 * n���� �޾Ƽ� �ݺ����� ����ؼ� 1���� n������ ����.
	 * ���࿡ �ݺ����� ���µ��� i�� �� + i�� �� �ڸ����� n�� �ȴٸ�
	 * �����ڰ��ȴ�. 
	 * �����ڰ� ������ �� ���� �����Ƿ� ������ �� ���� ���� ���� ����Ѵ�.
	 * �����ڰ� ������ 0�� ����Ѵ�.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 999999999; //������ �߿��� ���� ���� ���� �����Ѵ�.
		int result =0;//�������� ���� �����Ѵ�.
		int cnt =0; //�ݺ����� i���� ��´�.
		int temp =0;//i�� �� �ڸ��� ���� ��´�. 
		for (int i = 1; i < n; i++) {//1���� n������ ����.
			cnt =i; // cnt�� i�� ���� ��´�.
			temp = 0;// temp=0���� �ʱ�ȭ �Ѵ�.
			
			while(true) {//cnt�� 0�� �Ǹ� �����.
				if(cnt==0) {
					break;
				}
				//�Ʒ��� �ڵ�� cnt�� �ڸ����� temp�� ��� �����̴�.
				temp += cnt%10;
				cnt /=10;
				
			}
			
			result = temp+i; 
			//temp�� �� �ڸ����� �� , i�� �ݺ����� Ƚ���� ���Ѱ��� result�� ���Ѵ�
			if(result == n) {//���� result���� n���� �۴ٸ�
				if(min >i) {//min�� ��䰪�� i���� ũ�ٸ�
					min =i;//min�� ��� ���� i�� ��ü�Ѵ�. 
				}
			}
			
		}
		
		if(min!=999999999) {//��â�� min���� �ƴ϶�� min�� �������� ������
			System.out.println(min);
		}else {//�׿ܴ� �����ڰ� ����.
			System.out.println(0);
		}
		
	}

}
