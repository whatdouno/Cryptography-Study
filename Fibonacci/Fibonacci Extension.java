package baekjoonSolve;

import java.util.Scanner;
public class Main {
	/*골드바흐 파티션의 개수 구하기.*/
	public static void main(String[] args) {
		/*화폐의 종류가 K개라고 할 때, 코드의 시간 복잡도는 O(K)이다.*/
		Scanner scanner = new Scanner(System.in);
		long [] fiboList = new long[2000001];

		int N = scanner.nextInt() + 1000000;
		fiboList[1000001] = 1;
		
		for(int i=999999; i>=N; i--) {
			fiboList[i] = (fiboList[i+2] - fiboList[i+1]) % 1000000000 ;
		}


		for(int i=1000002; i<=N; i++) {
			fiboList[i] = (fiboList[i-1] + fiboList[i-2]) % 1000000000 ;
		}

		if(fiboList[N] > 0) {
			System.out.println(1);
		}
		else if(fiboList[N] == 0){
			System.out.println(0);
		}
		else {
			System.out.println(-1);
		}
		
		System.out.print(Math.abs(fiboList[N]));
	}
}