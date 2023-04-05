package baekjoonSolve;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//피보나치 수열 문제이다.

		Scanner scan = new Scanner(System.in);		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int count = 0;

		ArrayList<Boolean> primeNumList = new ArrayList<Boolean>(1001);


		/*일단 2부터 n까지 전부 소수 설정*/
		for(int i=0; i<n+1; i++ ) {
			primeNumList.add(i, false);
		}

		for(int i=2; i<=n; i++) {
			if(primeNumList.get(i) == false) {
				for(int j = i; j<=n; j+=i) {
					if(primeNumList.get(j) == false) {
						primeNumList.set(j, true);
						count += 1;
						if(count == k) {
							System.out.println(j);
							break;
						}
					}
				}
			}
		}
	}
}