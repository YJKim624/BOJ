package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

/*
 * @since 2021. 2. 15.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/3040
 * @mem 14996
 * @time 152
 * @caution 
 * 
 */

public class Main_3040_백설공주와일곱난쟁이v2 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();

	static int[] out = new int[7];
	static int[] in = new int[9];

	static int cnt;

	public static void main(String[] args) throws NumberFormatException, IOException {

//		BufferedReader br = new BufferedReader(new StringReader(src));

		for (int i = 0; i < 9; i++) {
			in[i] = Integer.parseInt(br.readLine());
		}

		// 입력 확인용 코드
//		for (int i = 0; i < in.length; i++) {
//			System.out.println(in[i]);
//		}

		combination(0, 0, 0);

		System.out.println(sb);
	}

	static void combination(int cnt, int start, int sum) {
		if (cnt == 7 && sum == 100) {
			for (int i = 0; i < out.length; i++) {
				sb.append(out[i] + "\n");
			}
			return;
		} else if (cnt == 7) {
			return;
		}

		for (int i = start; i < 9; i++) {
			out[cnt] = in[i];
			combination(cnt + 1, i + 1, sum + in[i]);
		}
	}

//	static String src = "7\r\n" + "8\r\n" + "10\r\n" + "13\r\n" + "15\r\n" + "19\r\n" + "20\r\n" + "23\r\n" + "25";
}
