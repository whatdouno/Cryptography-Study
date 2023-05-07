package baekjoonSolve;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int [] A = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = scanner.nextInt();
		}
		int X = scanner.nextInt();
		
		int start = 0;
		int end = N-1;
		int sum = 0;
		
		int count = 0;
		
		
		Arrays.sort(A);
		while(start< end) {
			sum = A[start] + A[end];
			if(sum == X) {
				count++;
			}
			
			if(sum <=X) {
				start++;
			}
			else {
				end--;
			}
		}
		
		
		
		System.out.println(count);

	}
}
