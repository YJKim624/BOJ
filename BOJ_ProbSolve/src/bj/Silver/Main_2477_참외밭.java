package bj.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 23.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/2477
 * @mem 14512
 * @time 136
 * @caution 
 * 1. 어떤 경우에서든(ㄱ모양 ㄴ모양 등등) 항상 큰 사각형 - 작은 사각형
 * 2. for문 돌릴 때 배열 범위 안나가도록 % 활용
 */

public class Main_2477_참외밭 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	static int K; // 면적 1 당 K개의 참외
	static int[] field = new int[6]; // 농장 변 6개

	public static void main(String[] args) throws NumberFormatException, IOException {

		K = Integer.parseInt(br.readLine());

		for (int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			st.nextToken();
			field[i] = Integer.parseInt(st.nextToken());
		}

//		// 입력 확인용
//		for (int i = 0; i < field.length; i++) {
//			System.out.print(field[i] + " ");
//		}

		int bigSquare = 0;
		int smallSquare = 0;
		for (int i = 0; i < 6; i++) {
			int area = field[i] * field[(i + 1) % 6];
			if (area > bigSquare) {
				bigSquare = area;
				smallSquare = field[(i + 3) % 6] * field[(i + 4) % 6];
			}
		}
		System.out.println((bigSquare - smallSquare) * K);
	}
}
