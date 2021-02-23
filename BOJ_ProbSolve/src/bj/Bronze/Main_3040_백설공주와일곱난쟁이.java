package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @since 2021. 2. 15.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/3040
 * @mem 16268
 * @time 148
 * @caution 
 * 
 */

public class Main_3040_백설공주와일곱난쟁이 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();

	static int[] in = new int[9]; // 들어온 아홉 난쟁이

	public static void main(String[] args) throws NumberFormatException, IOException {

		for (int i = 0; i < in.length; i++) {
			in[i] = Integer.parseInt(br.readLine()); // 들어온 아홉 난쟁이 입력
		}

		int sum = 0; // 나간 일곱 난쟁이들의 총 합은 100
		for (int i = 0; i < in.length; i++) {
			sum += in[i]; // 들어온 아홉 난쟁이들 총 합 입력
		}

		outer: for (int i = 0; i < in.length; i++) {
			for (int j = i + 1; j < in.length; j++) {
				if (((sum - in[i]) - in[j]) == 100) {
					in[i] = 0;
					in[j] = 0;
					break outer;
				}
			}
		}

		int cnt = 0;
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				continue;
			} else {
				sb.append(in[i] + "\n");
				cnt++;
				if (cnt == 7)
					break;
			}
		}

		System.out.println(sb);
	}

}
