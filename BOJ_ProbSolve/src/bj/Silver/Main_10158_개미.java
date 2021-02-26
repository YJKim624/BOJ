package bj.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.StringReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 26.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/10158
 * @mem 11528
 * @time 76
 * @caution 
 * 
 */

public class Main_10158_개미 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	static int w, h; // 공간의 가로 세로
	static int p, q; // 개미 초기 위치
	static int t; // 개미 이동 시간

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new StringReader(src));
		st = new StringTokenizer(br.readLine(), " ");
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		p = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());

		t = Integer.parseInt(br.readLine());

		int np = (p + t) % (2 * w);
		int nq = (q + t) % (2 * h);

		if (np > w) {
			np = (2 * w) - np;
		}
		if (nq > h) {
			nq = (2 * h) - nq;
		}

		sb.append(np + " " + nq);
		System.out.println(sb);
	}

	// static String src = "6 4\r\n" + "4 1\r\n" + "8";
}
