package BOJ;

import java.util.Scanner;

public class BOJ_°ýÈ£_9012_S4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int count =0;
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			count =0;
			if(s.length()%2==0) {
				for (int j = 0; j < s.length(); j++) {
					char c = s.charAt(j);
					if(c=='(') {
						count ++;
					}else {
						count--;
						if(count==-1) {
							break;
						}
					}
				}
				if(count==0) {
				System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else {
				System.out.println("NO");
			}
		}
		
	}
}
