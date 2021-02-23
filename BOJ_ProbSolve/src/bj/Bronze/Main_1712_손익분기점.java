package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 9.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/1712
 * @mem 14664
 * @time 128
 * @caution 
 * 
 */

public class Main_1712_손익분기점 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s = br.readLine();
		st = new StringTokenizer(s, " ");

		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long C = Integer.parseInt(st.nextToken());

		long ans;

		if (B>=C) {
			ans = -1;
		} else {
			ans = A/(C-B)+1;
		}

		System.out.println(ans);

	}

}
