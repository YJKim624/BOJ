package bj.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 9.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/2563
 * @mem 14560
 * @time 136
 * @caution 
 * 
 */

public class Main_2563_색종이 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int N; // 색종이 개수
	static int x, y; // 색종이 위치

	public static void main(String[] args) throws NumberFormatException, IOException {

		int[][] whiteP = new int[101][101]; // 100*100의 흰 도화지

		N = Integer.parseInt(br.readLine()); // 색종이 개수 입력

		for (int n = 0; n < N; n++) {
			String s = br.readLine();
			st = new StringTokenizer(s, " ");
			x = Integer.parseInt(st.nextToken()); // 색종이 x좌표 입력
			y = Integer.parseInt(st.nextToken()); // 색종이 y좌표 입력
			for (int i = y; i < y + 10; i++) {
				for (int j = x; j < x + 10; j++) {
					whiteP[i][j] = 1; // 색종이로 덮혀진 곳 1로 표시
				}
			}
		}

		// 답
		int answer = 0;
		for (int i = 0; i < whiteP.length; i++) {
			for (int j = 0; j < whiteP[i].length; j++) {
				if (whiteP[i][j] == 1) { // 흰 도화지에 1이 표시된 곳은
					answer++; // 정답 + 1
				}
			}
		}

		System.out.println(answer);

	}

}
