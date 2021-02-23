package bj.Bronze;

/*
 * @since 2021. 2. 8.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/10952
 * @mem 14516
 * @time 148
 * @caution 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10952_AplusB5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String s;

		while ((s = br.readLine()) != null) {
			st = new StringTokenizer(s, " ");

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			if (A == 0 && B == 0) {
				break;
			}
				sb.append(A + B).append("\n");
		}
		System.out.print(sb);

	}

}
