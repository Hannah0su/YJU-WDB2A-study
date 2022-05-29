package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_Ω∫≈√_10828_S4 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Stack<Integer> s = new Stack<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String command;
		int pushNum;
		
		for(int i = 0; i < n; i++) {
			command = br.readLine();
			if(command.contains("push")) {
				StringTokenizer st = new StringTokenizer(command, " ");
				st.nextToken();
				pushNum = Integer.parseInt(st.nextToken());
				s.push(pushNum);
				
			}
			else if(command.equals("pop")) {
				if(s.empty()) System.out.println(-1);
				else System.out.println(s.pop());
			}
			else if(command.equals("size")) System.out.println(s.size());
			else if(command.equals("empty")) {
				if(s.empty() == true) System.out.println(1);
				else System.out.println(0);
			}
			else if(command.equals("top")) {
				if(s.empty()) System.out.println(-1);
				else System.out.println(s.peek());
			}
			
		}
	}
}
