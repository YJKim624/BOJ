package bj.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @since 2021. 2. 16.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/10988
 * @mem 14652
 * @time 128
 * @caution 
 * 2번째 틀리는데 가운데서부터 하지 말고 앞에부터 하자 (그러면 홀수 경우 짝수 경우 나눠서 생각하지 않아도 된다.)
 */

public class Main_10988_펠린드롬인지확인하기 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static String s; // 입력 받을 단어
	static char[] word; // 입력 받을 단어 담을 char형 배열
	static boolean flag; // 팰린드롬인지 아닌지
	static int ans = 0; // 팰린드롬이면 1 아니면 0

	public static void main(String[] args) throws IOException {

		s = br.readLine();

		word = new char[s.length()];

		for (int i = 0; i < word.length; i++) {
			word[i] = s.charAt(i);
		}

//		// 입력확인용 코드
//		for(int i = 0;i<word.length;i++) {
//			System.out.print(word[i] + " ");
//		}

		flag = true;
		for (int i = 0; i < word.length / 2; i++) {
			if (word[i] == word[word.length - 1 - i]) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}

		if (flag == true) {
			ans = 1;
		} else {
			ans = 0;
		}

		System.out.println(ans);
	}

}
