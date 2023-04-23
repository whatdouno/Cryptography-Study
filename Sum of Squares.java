package baekjoonSolve;

import java.util.Scanner;
public class Main {
	/*골드바흐 파티션의 개수 구하기.*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int [] count = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			/*일단 최대값인 i로 설정해주고, (제곱수의 합 점화식의 최댓값 = i이다.)*/
			count[i] =i;
			for(int j=1; j*j<=i; j++) {
				if(count[i] > count[i - j*j] + 1) {
					count[i] = count[i - j*j] + 1;
				}
			}
		}
		System.out.println(count[n]);
	}
}