package bj.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 8.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/15651
 * @mem 71084
 * @time 612
 * @caution 
 * 
 */

public class Main_15651_N과M3 {

	static int N;
	static int M;

	static int[] arr;

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		permutationDup(M, new int[M]);
		
		System.out.println(sb);
	}

	static void permutationDup(int toChoose, int[] choosed) {
		if (toChoose == 0) {
			for (int i = 0; i < choosed.length; i++) {
				sb.append(choosed[i]).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = 0; i < N; i++) {
			choosed[choosed.length - toChoose] = arr[i];
			permutationDup(toChoose - 1, choosed);
		}
	}

}
