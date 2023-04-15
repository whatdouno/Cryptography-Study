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
		for(int i=0; i<N; i++)
		{
			numList[i] = sc.nextInt();
		}
		Arrays.sort(numList);
		int first = numList[N-1];
		int second = numList[N-2];
		/*수열을 파악하면 훨씬 easy하게 풀 수 있음.*/
		int count = M/(K+1) * K + M %(K+1);
		
		System.out.println(first * count + second * (M-count));
		
	}
}
