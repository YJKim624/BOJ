package bj.Bronze;

/*
 * @since 2021. 2. 5.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/10430
 * @mem 14652
 * @time 128
 * @caution 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10430_나머지 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		String s = br.readLine();
		st = new StringTokenizer(s);

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		sb.append((a + b) % c).append("\n").append(((a % c) + (b % c)) % c).append("\n").append((a * b) % c)
				.append("\n").append(((a % c) * (b % c)) % c).append("\n");
		
		System.out.println(sb);
	}

}
