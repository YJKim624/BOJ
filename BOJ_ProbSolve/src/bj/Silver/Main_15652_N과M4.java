package bj.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 8.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/15652
 * @mem 17588
 * @time 164
 * @caution 
 * 
 */

public class Main_15652_N과M4 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	static int N;
	static int M;

	static int[] arr;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		combinationDup(M, new int[M], 0);
		
		System.out.println(sb);

	}

	static void combinationDup(int toChoose, int[] choosed, int startIdx) {
		if (toChoose == 0) {
			if (toChoose == 0) {
				for (int i = 0; i < choosed.length; i++) {
					sb.append(choosed[i]).append(' ');
				}
				sb.append('\n');
				return;
			}
		}

		for (int i = startIdx; i < N; i++) {
			choosed[choosed.length - toChoose] = arr[i];
			combinationDup(toChoose - 1, choosed, i);
		}
	}

}
