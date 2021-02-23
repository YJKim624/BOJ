package bj.Bronze;

/*
 * @since 2021. 2. 4.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/1008
 * @mem 18396
 * @time 236
 * @caution 
 * 
 */

import java.util.Scanner;

public class Main_1008_AdivideB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		double answer = (double)A/(double)B;
		
		System.out.println(answer);
		sc.close();
	}

}
