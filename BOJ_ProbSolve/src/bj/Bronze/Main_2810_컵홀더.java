package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @since 2021. 2. 25.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/2810
 * @mem 11512
 * @time 84
 * @caution 
 * 만약 좌석이 2자리이고 SS이면 컵홀더의 개수는 3이다. 이 경우, 사람 수보다 컵홀더의 수가 더 많으므로 사람 수를 출력하도록 한다.
 */

public class Main_2810_컵홀더 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int N; // N개의 좌석
	static char[] seats; // 좌석 배열
	static int cntL;

	public static void main(String[] args) throws NumberFormatException, IOException {

		N = Integer.parseInt(br.readLine());

		seats = new char[N];
		String st = br.readLine();
		seats = st.toCharArray();

		// 입력 확인용
//		for (char c : seats) {
//			System.out.print(c + " ");
//		}

		cntL = 0;
		for (int i = 0; i < N; i++) {
			if (seats[i] == 'L') {
				cntL++;
			}
		}

		int ans = (N - (int) (cntL / 2)) + 1;
		if (ans > N) {
			ans = N;
		}
		System.out.println(ans);
	}

}
