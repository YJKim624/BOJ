package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @since 2021. 2. 18.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/1193
 * @mem 16688
 * @time 88
 * @caution 
 * i/j
 */

public class Main_1193_분수찾기 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int x; // x번째 분수 찾기

	public static void main(String[] args) throws NumberFormatException, IOException {

		x = Integer.parseInt(br.readLine());

		int cnt = 1;
		int sum = 0;

		while (sum < x) {
			sum += cnt;
			cnt++;
		}

		if (cnt % 2 != 0) {
			int i = cnt - (sum - x) - 1;
			int j = 1 + (sum - x);
			System.out.println(i + "/" + j);
		} else {
			int i = 1 + (sum - x);
			int j = cnt - (sum - x) - 1;
			System.out.println(i + "/" + j);
		}

	}

}
