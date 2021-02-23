package bj.Bronze;

/*
 * @since 2021. 2. 4.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/10869
 * @mem 18436
 * @time 232
 * @caution 
 * 
 */

import java.util.Scanner;

public class Main_10869_사칙연산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int sum = A + B;
		int minus = A - B;
		int multi = A * B;
		int divide = A / B;
		int leftover = A % B;

		System.out.printf("%d\n%d\n%d\n%d\n%d\n", sum, minus, multi, divide, leftover);
		sc.close();

	}

}
