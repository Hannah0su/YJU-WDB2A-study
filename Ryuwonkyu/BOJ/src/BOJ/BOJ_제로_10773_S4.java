package BOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_Á¦·Î_10773_S4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int k = sc.nextInt();
		int a = 0;
		for (int i = 0; i < k; i++) {
			int n = sc.nextInt();
			if(n!=0) {
				list.add(n);
			}else {
				list.remove(list.size()-1);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			a += list.get(i);
		}
		System.out.println(a);
		
	}

}
