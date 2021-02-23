package bj.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 8.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/1935
 * @mem 15000
 * @time 144
 * @caution 
 * 
 */

public class Main_1935_후위표기식2 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	static int N;
	static int[] arr;
	static Stack<Double> stack = new Stack<>();

	static double answer;

	public static void main(String[] args) throws NumberFormatException, IOException {

		N = Integer.parseInt(br.readLine());

		String s = br.readLine();

		arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (char c : s.toCharArray()) {
			switch (c) {
			case '+':
				stack.add(stack.pop() + stack.pop());
				break;
			case '-':
				double a = stack.pop();
				stack.add(stack.pop() - a);
				break;
			case '*':
				stack.add(stack.pop() * stack.pop());
				break;
			case '/':
				double b = stack.pop();
				stack.add(stack.pop() / b);
				break;
			default:
				stack.add(arr[c - 'A'] * 1.0);
			}
		}
		System.out.printf("%.2f", stack.pop());

	}

}
