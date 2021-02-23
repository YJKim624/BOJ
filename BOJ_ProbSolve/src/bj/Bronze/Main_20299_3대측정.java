package bj.Bronze;

/*
 * @since 2021. 2. 8.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/20299
 * @mem 224172
 * @time 996
 * @caution 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.StringReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_20299_3대측정 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	static int N; // 신청한 동아리의 수
	static int S; // 팀원 3명의 능력 합 가입조건
	static int M; // 개인 능력치 가입조건

	static Queue<Integer> members = new LinkedList<>(); // 합격자 명단
	static int teamCnt; // 합격 팀 수

	public static void main(String[] args) throws IOException {

		// 테스트케이스 실험용
		//BufferedReader br = new BufferedReader(new StringReader(src));

		String s = br.readLine();
		st = new StringTokenizer(s);		// N, S, M 나누기 위한 StringTokenizer

		N = Integer.parseInt(st.nextToken());		// 신청한 동아리 수 N 입력
		S = Integer.parseInt(st.nextToken());		// 팀원 3명의 능력 합 가입조건 S 입력
		M = Integer.parseInt(st.nextToken());		// 개인 능력치 가입조건 M 입력

		int A = 0, B = 0, C = 0;			// 동아리 팀원 A, B, C 세 명의 점수
		teamCnt = 0;		// 합격한 동아리 수

		for (int i = 0; i < N; i++) {
			s = br.readLine();
			st = new StringTokenizer(s);		// 동아리 팀원 A, B, C의 점수 나누기 위한 StringTokenizeer

			A = Integer.parseInt(st.nextToken());		// 팀원 A 점수 입력
			B = Integer.parseInt(st.nextToken());		// 팀원 B 점수 입력
			C = Integer.parseInt(st.nextToken());		// 팀원 C 점수 입력

			if (A + B + C >= S && A >= M && B >= M && C >= M) {		// 동아리 팀원 3명 능력 합이 S보다 크고 A, B, C 각 개인의 능력치가 M보다 크면 
				members.offer(A);		// 합격자 명단에 A 추가
				members.offer(B);		// 합격자 명단에 B 추가
				members.offer(C);		// 합격자 명단에 C 추가
				teamCnt++;			// 합격한 동아리 수 +1
			}

		}

		sb.append(teamCnt + "\n");
		for (int i = 0; i < teamCnt * 3; i++) {		// 현재 합격자 명단 Queue에는 합격한 동아리 수 당 3명의 동아리 팀원이 있으므로
			sb.append(members.poll() + " ");		// poll() 해주면서 StringBuilder에 답 쌓기
		}
		// 출력
		System.out.println(sb);
	}

	// 테스트 케이스 입력 데이터
//	static String src = "5 5000 1600\r\n" + "1621 1928 1809\r\n" + "2300 2300 1499\r\n" + "1805 1211 1699\r\n"
//			+ "1600 1700 1800\r\n" + "1792 1617 1830";
}
