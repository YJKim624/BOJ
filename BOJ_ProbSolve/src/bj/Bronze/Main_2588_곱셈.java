package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @since 2021. 2. 5.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/2588
 * @mem 16820
 * @time 172
 * @caution 
 * 
 */

public class Main_2588_곱셈 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int hund = (b/100);
		int ten = (b-(hund*100))/10;
		int one = ((b-hund*100)-(ten*10));
		
		int third = a * hund;
		int second = a*ten;
		int first = a * one;
		
		sb.append(first + "\n" + second + "\n" + third + "\n" + a*b);
		System.out.println(sb);

	}

}
