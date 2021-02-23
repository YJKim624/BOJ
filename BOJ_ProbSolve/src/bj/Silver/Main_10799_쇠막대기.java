package bj.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * @since 2021. 2. 4.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/10799
 * @mem 16700
 * @time 200
 * @caution 
 * 
 */

public class Main_10799_쇠막대기 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
//		BufferedReader br = new BufferedReader(new StringReader(src));
		
		String s = br.readLine();					// 괄호들 입력 받음
		Stack<Character> stack = new Stack<>();		// 스택 생성

		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);					// 괄호들을 char 하나로 찢어서 보자

			if (c == '(') {
				stack.push(c);
			}else {
				if(s.charAt(i-1) == '(') {
					stack.pop();
					sum += stack.size();
				}else {
					sum+=1;
					stack.pop();
				}
			} 
		}
		System.out.println(sum);
	}
	
//	static String src = "(((()(()()))(())()))(()())";
}
