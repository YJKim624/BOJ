package bj.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @since 2021. 2. 8.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/11729
 * @mem 60256
 * @time 424
 * @caution 
 * 
 */

public class Main_11729_하노이탑이동순서 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	
	static int K = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		int n = Integer.parseInt(br.readLine());

		hanoi(n, 1, 2, 3);
		
		System.out.println(K);
		System.out.println(sb);

	}

	private static void hanoi(int cnt, int from, int temp, int to) {
		if (cnt == 0)
			return;

		hanoi(cnt - 1, from, to, temp);
		sb.append(from + " " + to + "\n");
		K++;
		hanoi(cnt - 1, temp, from, to);
	}

}
