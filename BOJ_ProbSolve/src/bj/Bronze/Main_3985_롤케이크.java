package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.StringReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 26.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/3985
 * @mem 11996
 * @time 96
 * @caution 
 * 
 */

public class Main_3985_롤케이크 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	static int L; // 롤케이크의 길이
	static int[] rollcake; // 롤케이크 분배용
	static int N; // 방청객 수
	static int[] P; // 기대 시작
	static int[] K; // 기대 끝

	public static void main(String[] args) throws NumberFormatException, IOException {

//		BufferedReader br = new BufferedReader(new StringReader(src));

		L = Integer.parseInt(br.readLine()); // 롤케이크 길이 입력
		N = Integer.parseInt(br.readLine()); // 방청객 수 입력

		rollcake = new int[L + 1]; // 롤케이크 분배용 배열 생성
		P = new int[N + 1]; // 방청객 기대 조각 시작 입력
		K = new int[N + 1]; // 방청객 기대 조각 끝 입력
		int maxExpect = 0; // 기대하는 길이 최대
		int whoE = 0; // 기대하는 길이 최대인 사람
		for (int i = 1; i < N + 1; i++) { // 방청객은 1번부터 N번까지
			int expect = 0; // 각 방청객 기대하는 길이
			st = new StringTokenizer(br.readLine(), " ");
			P[i] = Integer.parseInt(st.nextToken()); // 기대 시작 입력
			K[i] = Integer.parseInt(st.nextToken()); // 기대 끝 입력
			expect = K[i] - P[i]; // 기대 길이는 끝 - 시작
			if (maxExpect < expect) { // 최대 길이 기대 방청객 중 번호가 가장 작은 사람을 구하기 위해 <
				maxExpect = expect; // 최대 기대 길이 수정
				whoE = i; // 최대 길이 원하는 사람 기억하기
			}
		}

		// 입력 확인용
//		for (int i = 0; i < N + 1; i++) {
//			System.out.print(P[i] + " ");
//		}
//		System.out.println();
//		for (int i = 0; i < N + 1; i++) {
//			System.out.print(K[i] + " ");
//		}
//		System.out.println();
//		System.out.println(maxExpect);

		for (int i = 1; i < N + 1; i++) { // N명의 사람이 실제로 주어진 번호대로 기대 길이 롤케이크 가져간다면
			for (int j = P[i]; j <= K[i]; j++) { // 기대 시작부터 기대 끝까지
				if (rollcake[j] != 0) { // 롤케이크가 이미 가져갔으면
					continue; // 스킵
				} else { // 롤케이크가 아직 있으면
					rollcake[j] = i; // 롤케이크 가져가기
				}
			}
		}

		// 입력 확인용
//		for(int i:rollcake) {
//			System.out.print(i + " ");
//		}

		int[] cnt = new int[N + 1]; // 누가 롤케이크를 얼마나 가져갔나 기록(index는 관객, data는 롤케이크 길이)
		int maxReal = 0; // 실제 최대로 가져간 길이
		int whoR = 0; // 실제 최대로 가져간 사람
		for (int i = 1; i < cnt.length; i++) { // 관객수만큼
			for (int j = 1; j < rollcake.length; j++) { // 각 관객이 가져간 롤케이크 길이만큼
				if (rollcake[j] == i) {	// 롤케이크를 가져간 관객
					cnt[i]++;	// 기록
				}else {
					continue;
				}
			}
			if (maxReal < cnt[i]) { // 실제 가져간 최대 길이로 비교
				maxReal = cnt[i]; // 최대로 가져간 길이 수정
				whoR = i; // 최대 길이 가져간 사람 기억하기
			}
		}

		// 출력
		sb.append(whoE + "\n" + whoR);
		System.out.println(sb);

	}

//	static String src = "10\r\n" + "3\r\n" + "2 4\r\n" + "7 8\r\n" + "6 9";

}
