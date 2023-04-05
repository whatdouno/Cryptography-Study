package baekjoonSolve;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int [] treeGrow = new int[N];
		/*입력값 받기*/
		for(int i=0; i<N; i++) {
			treeGrow[i] = sc.nextInt(); 
		}
		Arrays.sort(treeGrow);
		
		for(int i=0; i<N; i++) {
			treeGrow[i] += N-i;
		}
		
		Arrays.sort(treeGrow);
		System.out.println(treeGrow[N-1]+1);
	
	}

}