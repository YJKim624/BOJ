package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 24.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/2999
 * @mem 14292
 * @time 124
 * @caution 
 * 1. 입력할 땐 세로로, 출력할 땐 가로로(헷갈림 주의)
 */

public class Main_2999_비밀이메일 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	static String s; // 메세지 입력용
	static char[][] arr; // R*C=N인 배열 생성
	static int row, col; // 최종 배열 row, col

	static int R;
	static int C;

	public static void main(String[] args) throws IOException {

		s = br.readLine(); // 메세지 문자열 입력
		int len = s.length(); // 문자열 길이

		row = 0;
		col = 0;
		for (int r = 1; r <= len; r++) {
			for (int c = 1; c <= len; c++) {
				if (r <= c && r * c == len) { // r*c가 문자열 길이인 것들 중 r<=c 인 두 숫자 r, c 스택에 push
					row = r;
					col = c;
				}
			}
		}

		arr = new char[row][col]; // row*col 크기의 배열 생성
		int cnt = 0; // 배열 char 입력용
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				arr[j][i] = s.charAt(cnt); // 배열에 char 입력(cnt=0번째부터~)
				cnt++;
			}
		}

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				sb.append(arr[r][c]);
			}
		}

		System.out.println(sb);

	}

}
