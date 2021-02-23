package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 9.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/11720
 * @mem 14684
 * @time 136
 * @caution 
 * 
 */

public class Main_11720_숫자의합 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
//		String[]arr = s.split("");
		StringTokenizer st = new StringTokenizer(s, "");

		int sum = 0;
		for (int i = 0; i < N; i++) {
//			int num = Integer.parseInt(arr[i]);
			int num = Integer.parseInt(st.nextToken());
			sum += num;
		}

		System.out.println(sum);
	}

}
