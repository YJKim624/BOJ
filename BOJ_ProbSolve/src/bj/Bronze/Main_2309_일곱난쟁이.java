package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * @since 2021. 2. 20.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/2309
 * @mem 14932
 * @time 148
 * @caution 
 * 
 */

public class Main_2309_일곱난쟁이 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();

	static int[] out = new int[7]; // 나간 일곱 난쟁이(정답)
	static int[] in = new int[9]; // 들어온 아홉 난쟁이

	public static void main(String[] args) throws NumberFormatException, IOException {

		for (int i = 0; i < in.length; i++) {
			in[i] = Integer.parseInt(br.readLine());
		}
//		for (int i = 0; i < in.length; i++) {
//			System.out.print(in[i] + " ");
//		}
//		System.out.println();

		int sum = 0;
		for (int i = 0; i < in.length; i++) {
			sum += in[i];
		}
//		System.out.println("sum : " + sum);

		outer: for (int i = 0; i < 9; i++) {
			for (int j = i; j < 9; j++) {
				if (sum - in[i] - in[j] == 100 && i != j) {
					in[i] = 0;
					in[j] = 0;
					break outer;
				}
			}
		}

//		for (int i = 0; i < in.length; i++) {
//			System.out.print(in[i] + " ");
//		}
//		System.out.println();

		Arrays.sort(in);
		int cnt = 0;
		for (int i = 2; i < in.length; i++) {
			out[cnt] = in[i];
			cnt++;
		}

		for (int i = 0; i < out.length; i++) {
			sb.append(out[i] + "\n");
		}

		System.out.println(sb);

	}

}
