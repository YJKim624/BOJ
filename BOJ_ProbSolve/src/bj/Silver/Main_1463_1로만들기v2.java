package bj.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * @since 2021. 3. 23.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/1463
 * @mem 
 * @time 
 * @caution 
 * 
 */

public class Main_1463_1로만들기v2 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int N;
	static int[] memo;

	public static void main(String[] args) throws NumberFormatException, IOException {

		N = Integer.parseInt(br.readLine());

		memo = new int[N + 1];
		// 우리가 구할 값은 최소값 -> 최대값으로 초기화
		Arrays.fill(memo, Integer.MAX_VALUE);
		// 기저 조건에 해당하는 값: 1은 이미 1이기 때문에 추가적인 연산 불필요
		memo[1] = 0;

		System.out.println(topDown(N));
		System.out.println(bottomUp(N));

	}

	static int topDown(int n) {
		if (memo[n] != Integer.MAX_VALUE) {
			return memo[n];
		}
		// 아직 구해지지 않은 경우? 3가지 연산을 이용해서 최소 회수 구해보자
		// 1. 1을 빼는 경우
		int temp = topDown(n - 1);
		// 2. 3으로 나누어 떨어지는 경우
		if (n % 3 == 0) {
			temp = Math.min(temp, topDown(n / 3));
		}
		if (n % 2 == 0) {
			temp = Math.min(temp, topDown(n / 2));
		}

		return memo[n] = temp + 1;
	}

	static int bottomUp(int n) {
		// n을 1로 만드는 방법의 회수를 저장하는 배열
		int[] dp = new int[n + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[1] = 0;

		for (int i = 2; i <= n; i++) {
			int temp = dp[i - 1];
			if (i % 3 == 0) {
				temp = Math.min(temp, dp[i / 3]);
			}
			if (i % 2 == 0) {
				temp = Math.min(temp, dp[i / 2]);
			}
			dp[i] = temp + 1;
		}

		return dp[n];
	}
}
