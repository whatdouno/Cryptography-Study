package baekjoonSolve;

import java.util.Scanner;
public class Main {
	/*골드바흐 파티션의 개수 구하기.*/
	public static void main(String[] args) {
		/*화폐의 종류가 K개라고 할 때, 코드의 시간 복잡도는 O(K)이다.*/
		Scanner scanner = new Scanner(System.in);
		
		int change = scanner.nextInt();
		/*큰 단위 화폐부터 차례대로 확인.*/
		int [] coin_types = {500, 100, 50, 10};
		int count = 0;
		
		/*잔돈의 크기로 나누고 남은 나머지로 연산.*/
		for(int i=0; i<coin_types.length; i++) {
			count += change/coin_types[i];
			change %= coin_types[i];
		}
		
		System.out.println(count);
	}
}
