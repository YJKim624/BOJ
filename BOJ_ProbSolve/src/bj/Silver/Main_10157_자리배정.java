package bj.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 21.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/10157
 * @mem 
 * @time 
 * @caution 
 * 
 */

public class Main_10157_자리배정 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	static int C, R;
	static int K; // K번째 관객
	static int[][] seat; // 자리배치 배열

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine(), " ");

		C = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());

		seat = new int[R+1][C+1];
		
		int num = 1;
		while(true) {
			
		}
	}

}
