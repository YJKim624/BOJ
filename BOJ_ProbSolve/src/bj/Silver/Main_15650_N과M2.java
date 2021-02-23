package bj.Silver;

import java.util.Scanner;

/*
 * @since 2021. 2. 8.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/15650
 * @mem 19432
 * @time 276
 * @caution 
 * 
 */

public class Main_15650_N과M2 {

	static int N;
	static int M;

	static int[] arr;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		combination(M, new int[M], 0);
		
		sc.close();
	}

	static void combination(int toChoose, int[] choosed, int startIdx) {
		if (toChoose == 0) {
			for (int i = 0; i < choosed.length; i++) {
				System.out.print(choosed[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = startIdx; i < N; i++) {
			choosed[choosed.length-toChoose] = arr[i];
			combination(toChoose - 1, choosed, i + 1);
		}
	}

}
