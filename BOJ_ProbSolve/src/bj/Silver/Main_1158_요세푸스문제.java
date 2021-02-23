package bj.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.StringReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 * @since 2021. 2. 9.
 * @author yjkim
 * @see https://www.acmicpc.net/problem/1158
 * @mem 295576
 * @time 556
 * @caution 
 * 
 */

public class Main_1158_요세푸스문제 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;

	static int N; // 양의 정수 개수(1~N까지)
	static int K; // 뽑는 간격
	static Queue<Integer> queue = new LinkedList<>(); // 정수 저장할 Queue
	static int[] answer; // 순열 출력할 배열 - 정답

	public static void main(String[] args) throws IOException {

		//BufferedReader br = new BufferedReader(new StringReader(src));		// 예제 테케 입력

		String s = br.readLine();
		st = new StringTokenizer(s, " "); // N, K 분리할 StringTokenizer
		N = Integer.parseInt(st.nextToken()); // 양의 정수 입력
		K = Integer.parseInt(st.nextToken()); // 뽑는 간격 입력

		for (int i = 1; i <= N; i++) {
			queue.offer(i); // Queue에 정수 저장
		}

//		for(int i = 0;i<N;i++) {
//			System.out.println(queue.poll());
//		}

		// 1 2 3 4 5 6 7 -> 3 6 2 7 5 1 4
		int index = 0; // 정답 배열의 인덱스
		int cnt = 1; // 반복 횟수 count
		answer = new int[N]; // 입력 받은 정수 N 크기로 정답 배열 초기화

		while (!queue.isEmpty()) {		// Queue에 입력 받은 정수 다 쓸 때까지
			if (cnt % K == 0) {		// K번째이면
				answer[index] = queue.poll();		// 정답에 해당 정수 poll
				index++;		// 정답 인덱스 +1
			} else {
				queue.offer(queue.poll());		// Queue의 가장 앞에 있는 정수 가장 뒤로 이동
			}
			cnt++;		// 반복 횟수 +1
		}
		
		// StringBuilder에 정답 쌓기
		sb.append("<" + answer[0]);
		for (int i = 1; i < answer.length; i++) {
			sb.append(", " + answer[i]);
		}
		sb.append(">");
		
		// 출력
		System.out.println(sb);

	}

	//static String src = "7 3";		// 예제 테케
}
