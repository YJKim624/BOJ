package bj.Bronze;

import java.util.Scanner;

/*
 * @since 2021. 2. 4.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/10998
 * @mem 18344
 * @time 232
 * @caution 
 * 
 */

public class Main_10998_AmultiplyB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int answer = A*B;
		
		System.out.println(answer);
		
		sc.close();
	}

}
