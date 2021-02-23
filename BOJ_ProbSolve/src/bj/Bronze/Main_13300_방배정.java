package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 22.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/13300
 * @mem 14788
 * @time 152
 * @caution 
 * 
 */

public class Main_13300_방배정 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int N, K; // 학생 수 N, 방 배정 최대 인원 K
	static int[] S; // 성별 S
	static int[] Y; // 학년 Y

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		S = new int[N];
		Y = new int[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			S[i] = Integer.parseInt(st.nextToken());
			Y[i] = Integer.parseInt(st.nextToken());
		}

		int[][] students = new int[2][7];

		for (int i = 0; i < N; i++) {
			students[S[i]][Y[i]]++;
		}

//		// 입력 확인용
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 7; j++) {
//				System.out.print(students[i][j] + " ");
//			}
//			System.out.println();
//		}

		int room = 0;
		for (int i = 0; i < students.length; i++) {
			for (int j = 1; j < students[i].length; j++) {
				if (students[i][j] % K > 0) {
					room += ((students[i][j] / K) + 1);
				} else {
					room += (students[i][j] / K);
				}
			}
		}

		System.out.println(room);
	}

}
