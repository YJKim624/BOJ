package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 4.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/1000
 * @mem 14992
 * @time 144
 * @caution 
 * 
 */

public class Main_1000_AplusB {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		System.out.printf("%d\n", A + B);
	}

}
