package bj.Silver;

import java.util.Scanner;

/*
 * @since 2021. 2. 7.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/15649
 * @mem 71568
 * @time 2280
 * @caution 
 * 
 */

public class Main_15649_N과M1 {

	static int N;
	static int M;

	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		permutation(M, new int[M], new boolean[N]);

		sc.close();

	}

	static void permutation(int toChoose, int[] choosed, boolean[] visited) {
		if (toChoose == 0) {
			//System.out.print(choosed.toString() + " ");
			for(int i = 0;i<choosed.length;i++) {
				System.out.print(choosed[i] + " ");
			}System.out.println();
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				choosed[choosed.length - toChoose] = arr[i];
				permutation(toChoose - 1, choosed, visited);
				visited[i] = false;
			}
		}
	}

}
