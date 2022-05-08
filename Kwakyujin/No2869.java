package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class No2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a, b, v, day;
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		day = (v - b) / (a - b);
		if ((v - b) % (a - b) != 0)
			day++;
		System.out.println(day);
	}
}