package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 5.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/10871
 * @mem 18356
 * @time 212
 * @caution 
 * 
 */

public class Main_10871_X보다작은수 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < x) {
				sb.append(arr[i] + " ");
			}
		}

		System.out.println(sb);

	}

}
