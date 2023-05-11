package baekjoonSolve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		boolean [] primeNumboolList = new boolean[N+2];
		primeNumboolList[0] = false;
		primeNumboolList[1] = false;
		primeNumboolList[2] = true;
		/*일단 2부터 n까지 전부 소수 설정*/
		for(int i=2; i<N+1; i++ ) {
			primeNumboolList[i] = true;
		}

		for(int i=2; i*i<=N+1; i++) {
			if(primeNumboolList[i]) {
				for(int j = i*i; j<N+1; j+=i) {
					primeNumboolList[j] = false;
				}
			}
		}
		
		List<Integer> pList = new ArrayList<>();
		for(int i=2; i<N+1; i++) {
			if(primeNumboolList[i]) {
				pList.add(i);
			}
		}
		
		int start = 0;
		int end = 0;
		int count = 0;
		long sum = 0;
		
		while(true) {
			
			if(sum >= N) {
				sum -= pList.get(start++);
			}
			
			else if(end == pList.size()) {
				break;
			}
			else {
				sum += pList.get(end++);
			}
			
			
			if(N == sum) {
				count++;
			}
			
		}
		System.out.println(count);
	}
}
