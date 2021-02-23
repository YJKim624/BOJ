package bj.Bronze;

/*
 * @since 2021. 2. 8.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/11023
 * @mem 14592
 * @time 128
 * @caution 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11023_더하기3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String s = br.readLine();
		st = new StringTokenizer(s, " ");

		int sum = 0;
		int input = 0;
		int cnt = st.countTokens();
		for (int i = 0; i < cnt; i++) {
			input = Integer.parseInt(st.nextToken());
			sum += input;
		}
		sb.append(sum);
		
		System.out.println(sb);

	}

}
