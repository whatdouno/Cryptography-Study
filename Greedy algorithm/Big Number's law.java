package baekjoonSolve;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int [] numList = new int[N];
		
		for(int i=0; i<N; i++) {
			numList[i] = sc.nextInt();
		}
		Arrays.sort(numList);
		int first = numList[N-1];
		int second = numList[N-2];
		
		int sum = 0;
		
		while(true) {
			for (int i=0; i<K; i++){
				if(M == 0) {
					break;
				}
				sum += first;
				M -=1;
			}
			if(M == 0) {
				break;
			}
			sum += second;
			M -= 1;
		}
		
		System.out.println(sum);
		
		
	}
}
