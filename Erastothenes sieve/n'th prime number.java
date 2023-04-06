package baekjoonSolve;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		int k = scan.nextInt();
		int count = 0;
		boolean [] primeNumList = new boolean[10000001];
		primeNumList[0] = false;
		primeNumList[1] = false;
		primeNumList[2] = true;
		/*일단 2부터 n까지 전부 소수 설정*/
		for(int i=2; i<10000001; i++ ) {
			primeNumList[i] = true;
		}

		for(int i=2; i*i<=10000000; i++) {
			if(primeNumList[i]) {
				for(int j = i*i; j<=10000000; j+=i) {
					primeNumList[j] = false;
				}
			}
		}
		for(int i=2; i<10000001; i++) {
			if(primeNumList[i]) {
				count++;
				if(count == k) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}