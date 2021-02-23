package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @since 2021. 2. 8.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/11718
 * @mem 14648
 * @time 144
 * @caution 
 * 
 */

public class Main_11718_그대로출력하기 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		
		String s;

		while((s=br.readLine()) != null) {
			sb.append(s + "\n");
		}
		
		System.out.println(sb);

	}

}
