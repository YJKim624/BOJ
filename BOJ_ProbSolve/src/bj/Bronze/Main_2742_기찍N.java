package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @since 2021. 2. 5.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/2742
 * @mem 32476
 * @time 1056
 * @caution 
 * 
 */

public class Main_2742_기찍N {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = n;i>0;--i) {
			System.out.println(i);
		}

	}

}
