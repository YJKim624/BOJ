package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 25.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/2869
 * @mem 11520
 * @time 76
 * @caution 
 * 
 */

public class Main_2869_달팽이는올라가고싶다 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	static int A, B, V;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine(), " ");

		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());

//		int days = 0;
//		int cur_height = 0;
//		while (true) {
//			if (A + cur_height >= V) {
//				days++;
//				break;
//			} else {
//				days++;
//				cur_height += (A - B);
//			}
//		}
		if (A >= V)
			System.out.print(1);
		else if ((V - A) % (A - B) > 0)
			System.out.print((V - A) / (A - B) + 2);
		else
			System.out.print((V - A) / (A - B) + 1);

//		sb.append(days);
//		System.out.println(sb);
	}

}
