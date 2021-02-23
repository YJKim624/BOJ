package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 22.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/10163
 * @mem 16488
 * @time 156
 * @caution 
 * 
 */

public class Main_10163_색종이 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	static int N;
	static int[][] arr = new int[101][101];

	public static void main(String[] args) throws NumberFormatException, IOException {

		N = Integer.parseInt(br.readLine());

		int[] x, y, width, height;
		x = new int[N];
		y = new int[N];
		width = new int[N];
		height = new int[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
			width[i] = Integer.parseInt(st.nextToken());
			height[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			for (int r = y[i]; r < y[i] + height[i]; r++) {
				for (int c = x[i]; c < x[i] + width[i]; c++) {
					arr[r][c] = i + 1;
				}
			}
		}

//		// 입력 확인용
//		for (int i = 0; i < 101; i++) {
//			for (int j = 0; j < 101; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

		int[] cnt = new int[N + 1];
		for (int r = 0; r < 101; r++) {
			for (int c = 0; c < 101; c++) {
				cnt[arr[r][c]]++;
			}
		}

		for (int i = 1; i < cnt.length; i++) {
			sb.append(cnt[i] + "\n");
		}

		System.out.println(sb);
	}

}
