package bj.Bronze;

/*
 * @since 2021. 2. 9.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/15596
 * @mem 422788
 * @time 28
 * @caution 
 * 
 */

public class Main_15596_정수N개의합 {

	long sum(int[] a) {
		long ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
	}

}
