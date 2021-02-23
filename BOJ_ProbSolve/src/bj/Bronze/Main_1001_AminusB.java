package bj.Bronze;

/*
 * @since 2021. 2. 4.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/1001
 * @mem 18444
 * @time 236
 * @caution 
 * 
 */

import java.util.Scanner;

public class Main_1001_AminusB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int answer = A - B;
		
		System.out.printf("%d\n", answer);
		
		sc.close();
	}

}
