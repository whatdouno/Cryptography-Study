package baekjoonSolve;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [][] numList = new int[N][M];
		int [] min = new int [N];
		for(int i=0; i<N; i++)
		{
			int temp = 10001;
			for(int j=0; j<M; j++)
			{
				numList[i][j] = sc.nextInt();
				if(numList[i][j]< temp) {
					temp = numList[i][j];
				}
			}
			min[i] = temp;
		}
		int max = -1;
		for(int i=0; i<N; i++) {
			if(max < min[i]) {
				max = min[i];
			}
		}
		
		System.out.println(max);
		
	}
}
