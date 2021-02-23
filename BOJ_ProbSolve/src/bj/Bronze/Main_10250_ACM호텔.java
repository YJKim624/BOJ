package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 9.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/10250
 * @mem 17772
 * @time 172
 * @caution 
 * 
 */

public class Main_10250_ACM호텔 {

	static int T;

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	static int[][] hotel;
	static int H;
	static int W;
	static int N;

	public static void main(String[] args) throws IOException {

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			String s = br.readLine();
			st = new StringTokenizer(s, " ");

			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());

			hotel = new int[H + 1][W + 1];
			int cnt = 0;
			int x = 0;
			int y = 0;

			outer: for (int i = 1; i <= W; i++) {
				for (int j = 1; j <= H; j++) {
					if(cnt==N) {
						break outer;
					}
					hotel[j][i] = ((j * 100) + (i));
					++cnt;
					y = j;
					x = i;
				}
			}

			sb.append((y*100+x) + "\n");

		}
		
		System.out.println(sb);
	}

}
