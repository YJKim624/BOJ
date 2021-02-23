package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @since 2021. 2. 18.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/1193
 * @mem 
 * @time 
 * @caution 
 * 
 */

public class Main_1193_분수찾기 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int x; // x번째 분수 찾기
	static int[][] arr; // 분수 넣을 배열

	public static void main(String[] args) throws NumberFormatException, IOException {

		x = Integer.parseInt(br.readLine());

		arr = new int[x + 1][2];

		int idx = 1;
		int cnt = 1;

		outer: while (idx <= x) {
			int start = cnt;
			int j = 1;
			if (cnt % 2 != 0) {
				while (j <= cnt) {
					arr[idx][0] = start;
					arr[idx][1] = j;
					start--;
					j++;
					idx++;
					if (idx > x) {
						break outer;
					}
				}
			} else if (cnt % 2 == 0) {
				while (j <= cnt) {
					arr[idx][0] = j;
					arr[idx][1] = start;
					start--;
					j++;
					idx++;
					if (idx > x) {
						break outer;
					}
				}
			}
			cnt++;
		}

		System.out.println(arr[x][0] + "/" + arr[x][1]);

	}

}
