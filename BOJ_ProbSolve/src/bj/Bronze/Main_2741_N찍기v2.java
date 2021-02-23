package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @since 2021. 2. 5.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/2741
 * @mem 18772
 * @time 232
 * @caution 
 * 
 */

public class Main_2741_N찍기v2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1;i<=n;i++) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);

	}

}
