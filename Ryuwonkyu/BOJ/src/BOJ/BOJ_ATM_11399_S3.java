package BOJ;


	import java.util.Scanner;
	import java.util.Arrays;

	public class BOJ_ATM_11399_S3 {
		public static void main(String[] args)   {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//����� �Է¹ޱ�
		int [] arr = new int[n];//������� �ɸ��� �ð� �Է¹ޱ�
		int result =0;//�� �ɸ��� �ð� ���� ����
		int count =0;//�������� ���� ���� 
		for (int i = 0; i < arr.length; i++) {//�迭�� �ɸ��� �ð� �ޱ�
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);//�����ϱ�
		
		for (int i = 0; i < arr.length; i++) {
			count += arr[i];//count�� �迭�� �� �������� ���ϱ�
			result += count;//result ������ count�� ���ϱ� 
		}
		System.out.println(result);
		
		}
	}

