package baekjoonSolve;

import java.util.Scanner;
public class Main {
	/*골드바흐 파티션의 개수 구하기.*/
	public static void main(String[] args) {
		/*화폐의 종류가 K개라고 할 때, 코드의 시간 복잡도는 O(K)이다.*/
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int x0 = scanner.nextInt();
		int N = scanner.nextInt();
		
		for(int i=0; i<N; i++) {
			if(x0 % 2 == 0) {
				x0 = (x0/2)^6;
			}
			else {
				x0 = (x0*2)^6;
			}
			
		}
		System.out.println(x0);
	}
}