package bj.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.StringReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 26.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/12789
 * @mem 11936
 * @time 88
 * @caution 
 * 
 */

public class Main_12789_도키도키간식드리미 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int N;

	static Stack<Integer> stack;
	static Queue<Integer> queue;

	public static void main(String[] args) throws NumberFormatException, IOException {

//		BufferedReader br = new BufferedReader(new StringReader(src));

		N = Integer.parseInt(br.readLine());
		queue = new LinkedList<Integer>();

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			int nums = Integer.parseInt(st.nextToken());
			queue.offer(nums);
		}

		// 입력 확인용
//		for (int i = 0; i < N; i++) {
//			System.out.println(queue.poll());
//		}

		stack = new Stack<Integer>();
		int num = 1;

		while (!queue.isEmpty()) {
			if (queue.peek() == num) {
				queue.poll();
				num++;
			} else if (!stack.isEmpty() && stack.peek() == num) {
				stack.pop();
				num++;
			} else {
				stack.push(queue.poll());
			}
		}
		
		while(!stack.isEmpty()) {
			if(stack.peek()==num) {
				stack.pop();
				num++;
			}else {
				break;
			}
		}

		if (stack.isEmpty()) {
			System.out.println("Nice");
		} else {
			System.out.println("Sad");
		}

	}

//	static String src = "5\r\n" + "5 4 1 3 2";
}
