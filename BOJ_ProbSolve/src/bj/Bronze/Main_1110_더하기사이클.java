package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 8.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/1110
 * @mem 14788
 * @time 132
 * @caution 
 * 
 */

public class Main_1110_더하기사이클 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {

		N = Integer.parseInt(br.readLine());

		int newNum = 0;

		int ten = N / 10;
		int one = N - ((N / 10) * 10);

		int cnt = 0;
		
		if(N==0) {
			cnt++;
		}

		while (N!=0) {
			if (newNum == N) {
				break;
			}else {
				if (ten + one >= 10) {
					newNum = (one * 10) + ((ten + one) - 10);
					++cnt;
				} else {
					newNum = (one * 10) + (ten + one);
					++cnt;
				}
			}
			ten = newNum / 10;
			one = newNum - ((newNum / 10) * 10);
		}

		System.out.println(cnt);

	}

}
