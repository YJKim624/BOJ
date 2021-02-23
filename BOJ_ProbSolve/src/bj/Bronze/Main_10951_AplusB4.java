package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 8.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/10951
 * @mem 14556
 * @time 132
 * @caution 
 * 
 */

public class Main_10951_AplusB4 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String s;

		while ((s = br.readLine()) != null) {
			st = new StringTokenizer(s, " ");

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			sb.append(A + B).append("\n");
		}
		System.out.print(sb);
	}

}
