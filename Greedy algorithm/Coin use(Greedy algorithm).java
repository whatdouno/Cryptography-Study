package baekjoonSolve;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int [] coinCase = new int[N];
		/*입력값 받기*/
		for(int i=0; i<N; i++) {
			coinCase[i] = sc.nextInt(); 
		}
		
		int count = 0;
		
		for(int i= N-1; i>=0; i--) {
			while(coinCase[i] <= K) {
				K -= coinCase[i];
				count++;
			}
		}
		
		System.out.println(count);
	}

}