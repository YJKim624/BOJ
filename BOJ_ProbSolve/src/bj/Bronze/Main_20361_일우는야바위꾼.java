package bj.Bronze;

/*
 * @since 2021. 2. 8.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/20361
 * @mem 43516
 * @time 596
 * @caution 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.StringReader;
import java.util.StringTokenizer;

public class Main_20361_일우는야바위꾼 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	//static int T; // 테스트 횟수
	static int N; // 종이컵 개수
	static int X; // 간식 위치
	static int K; // 컵 위치 바꾸는 횟수

	static int answer;

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 테스트케이스 실험용
//		BufferedReader br = new BufferedReader(new StringReader(src));

		//T = Integer.parseInt(br.readLine()); // 테스트 횟수 입력

		//for (int t = 1; t <= T; t++) {
			String s = br.readLine();
			st = new StringTokenizer(s, " "); // N, X, K 분리 위한 StringTokenizer

			N = Integer.parseInt(st.nextToken()); // 종이컵 개수 입력
			X = Integer.parseInt(st.nextToken()); // 간식 위치 입력
			K = Integer.parseInt(st.nextToken()); // 컵 위치 바꾸는 횟수 입력

			boolean[] cups = new boolean[N + 1]; // N개의 컵을 나타내는 간식 유무 나타낼 boolean 배열, 1번 컵부터 N번 컵까지, cups[0]을 temp처럼 임시저장소로 사용

			for (int i = 1; i <= N; i++) {
				if (i == X) { // 배열의 i번째에 위치가 간식의 위치라면
					cups[i] = true; // 간식 위치 표시
				} else {
					cups[i] = false; // 아니면 false
				}
			}

//			for(int i = 1;i<=N;i++) {
//				System.out.println(arr[i]);
//			}

			int swap1, swap2;		// 위치 바꾸는 컵 번호
			for (int i = 0; i < K; i++) {
				s = br.readLine();
				st = new StringTokenizer(s, " ");	// 위치 바꾸는 컵 분리 위한 StringTokenizer

				swap1 = Integer.parseInt(st.nextToken());	// 바꾸는 컵 위치 1 입력
				swap2 = Integer.parseInt(st.nextToken());	// 바꾸는 컵 위치 2 입력

				cups[0] = cups[swap1];		// 자리 바꾸기 위한 임시공간인 cups[0]에 바꾸는 컵 1번의 간식 유무 입력
				cups[swap1] = cups[swap2];	// 바꾸는 컵 1번에 바꾸는 컵 2번의 간식 유무 입력
				cups[swap2] = cups[0];		// 바꾸는 컵 2번에 임시공간(바꾸는 컵 1번)의 간식 유무 입력
			}

			for (int i = 0; i < cups.length; i++) {
				if (cups[i] == true) {		// 해당 i번째 컵에 간식이 있다면
					answer = i;			// i가 정답
				} else {
					continue;			// 아니면 계속 찾아
				}
			}
			// StringBuilder에 정답 쌀기
			//sb.append("#" + t + " " + answer + "\n");
		//}
		// 출력
		System.out.println(answer);
	}

	// 테스트 케이스 입력 데이터
//	static String src = "3\r\n" + "3 2 4\r\n" + "1 3\r\n" + "3 2\r\n" + "3 1\r\n" + "2 3\r\n" + "5 2 6\r\n" + "1 2\r\n"
//			+ "1 3\r\n" + "1 4\r\n" + "1 5\r\n" + "2 3\r\n" + "3 4\r\n" + "3 1 3\r\n" + "1 2\r\n" + "2 1\r\n" + "1 2";

}
