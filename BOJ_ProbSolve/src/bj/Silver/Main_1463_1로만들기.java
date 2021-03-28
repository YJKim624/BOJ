package bj.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @since 2021. 3. 23.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/1463
 * @mem 15500
 * @time 96
 * @caution 
 * 1로 만드는 방법이 여러가지 경우인 X가 있다. (ex.10, 12) 
 */

public class Main_1463_1로만들기 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int X;
	// 주어진 정수 X가 1이 되기 위한 연산 횟수
	static int[] memo;

	public static void main(String[] args) throws NumberFormatException, IOException {

		X = Integer.parseInt(br.readLine());

		memo = new int[X + 1];
		memo[0] = 0;
		memo[1] = 0;

		System.out.println(operation(X));
	}

	static int operation(int n) {

		for (int i = 2; i <= n; i++) {
			// 1. 1을 뺀 경우(모든 수에 적용 가능)
			memo[i] = memo[i - 1] + 1;
			// 2. 3으로 나누는 경우(3으로 나눌 수 있으면)
			if (i % 3 == 0) {
				memo[i] = Math.min(memo[i], memo[i / 3] + 1);	// 최소값
			}
			// 3. 2로 나누는 경우(2로 나눌 수 있으면)
			if (i % 2 == 0) {
				memo[i] = Math.min(memo[i], memo[i / 2] + 1);	// 최소값
			}
		}

		return memo[n];
	}

}
