package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 5.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/15552
 * @mem 220408
 * @time 808
 * @caution 
 * 
 */

public class Main_15552_빠른AplusB {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1;t<=T;t++) {
			String s = br.readLine();
			st = new StringTokenizer(s, " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int sum = a + b;
			
			sb.append(sum).append("\n");
		}
		System.out.println(sb);

	}

}
