package BOJ;


	import java.util.Scanner;
	import java.util.Arrays;

	public class BOJ_����_2798_B2 {
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();//ī���� ����
	        int [] arr = new int [n];//ī�� ������ŭ �迭 ����
	        int sum = sc.nextInt();//���� ��Ģ�� ���� 3�����̾� ���� ����
	        int temp =0;//��ȯ�� ����
	        int result =0;//����� 
	        
	        for (int i = 0; i < arr.length; i++) {//�迭���ٰ� ī����ڸ� �޾� �ִ´�. 
				arr[i] = sc.nextInt();	
			}
	        
	        Arrays.sort(arr);//�����Ѵ�
	        
	        for (int i = 0; i < arr.length; i++) {
	        	//ī�带 3���� �̾� sum���� �ٻ簪�� ã�ƾ��ϹǷ�
	        	//3�������� �����Ͽ��� ã�´�.
				for (int j = 0; j < arr.length; j++) {
					for (int j2 = 0; j2 < arr.length; j2++) {
						if(i!=j && j!=j2 && i!=j2) {
							//ī�带 �ѹ����� �� �����Ƿ� i,j,j2�� ���� �� �޶���Ѵ�. 1,1,1�� �Ǹ�ȵȴٴ� ��
							temp=arr[i]+arr[j]+arr[j2];//j2�� �ϳ��� �÷������鼭 ����� ���� ã�´�. 
							if(temp<= sum && result <= temp) {
								//sum���� �۰ų� ũ�� ������ result������ temp�� ũ�ų� ������ result�� ���� temp�� ��ȯ�Ѵ�.
								result = temp;
							}
						}
					}
				}
			}
	        System.out.println(result);//��� ���
	    }

}
