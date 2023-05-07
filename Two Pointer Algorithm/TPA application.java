package baekjoonSolve;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int [] A = new int[N];
		
		int ans = 1000001;
		long S = scanner.nextLong();
		
		/*Two Pointer Algorithm의 기본 변수 start, end, interval Sum.*/
		long interval_sum = 0;
		int start;
		int end = 0;
		
		/*1. Data들을 먼저 행렬에 저장하고*/
		for(int i=0; i<N; i++) {
			A[i] = scanner.nextInt();
		}
		/*2. interval Sum을 0으로 시작해서, start는 0번째이므로, 0번째부터 end번째까지 더해나간다.
		 * end를 0번째부터 시작하여, sum이 목푯값 M을 넘지 않을 때까지 brute force로 계속 더한다.
		 * 딱 M이 되었다면, count한다. M을 초과한다면, 첫번째것을 뺀다.*/
		for(start=0; start<N; start++) {
			while(interval_sum < S && end < N) {
				interval_sum += A[end];
				end += 1;
			}
			if(interval_sum >= S) {
				ans = (end - start < ans) ? (end - start) : ans;
			}
			interval_sum -= A[start];
		}

		if(ans == 1000001) {
			System.out.println(0);
		}
		else {
			System.out.println(ans);
		}
	}
}
